package com.chainerist.demo.smart.contract.pattern.test;

import com.chainerist.demo.smart.contract.pattern.generated.*;
import org.junit.jupiter.api.*;
import org.web3j.EVMTest;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.exceptions.TransactionException;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@EVMTest
@Tag("PatternTest")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PatternTest {

    @Test
    @Order(1)
    public void proxyPattern(Web3j web3j, TransactionManager transactionManager, ContractGasProvider gasProvider) throws Exception {

        //Deploy the Example contract below
        Example exampleContract = Example.deploy(web3j, transactionManager, gasProvider).send();

        //Deploy the Dispatcher contract with the Example address
        Dispatcher dispatcher = Dispatcher.deploy(web3j, transactionManager, gasProvider, exampleContract.getContractAddress()).send();

        //Load the Example contract with the Dispatcher address
        Example loadExampleContact = Example.load(dispatcher.getContractAddress(), web3j, transactionManager, gasProvider);

        //Test the Example contract
        loadExampleContact.setUint(BigInteger.TWO).send();
        loadExampleContact.getUint().send();

        assertEquals(loadExampleContact.getUint().send(), new BigInteger("2"));

        //Then deploy the smartContractV2 contract below
        ExampleV2 exampleV2 = ExampleV2.deploy(web3j, transactionManager, gasProvider).send();
        //Using the Dispatcher upgrade function to set the address to the ExampleV2 contract
        dispatcher.replace(exampleV2.getContractAddress()).send();

        //Test the V2 contract
        assertEquals(loadExampleContact.getUint().send(), new BigInteger("4"));

    }

    @Test
    @Order(2)
    public void interFacePattern(Web3j web3j, TransactionManager transactionManager, ContractGasProvider gasProvider) throws Exception {
        //Deploy the main contract below
        MainContract mainContract = MainContract.deploy(web3j, transactionManager, gasProvider).send();

        //Deploy the satelliteV1 contract
        SatelliteV1 satelliteV1 = SatelliteV1.deploy(web3j, transactionManager, gasProvider).send();

        //Call the upgrade function of the main contact using the address of the satelliteV1 contract
        mainContract.upgrade(satelliteV1.getContractAddress()).send();
        System.out.println(satelliteV1.getAge().send());

        // Test the main contract by calling the getAge function
        assertEquals(satelliteV1.getAge().send().intValue(), 25);

        //Then deploy the satelliteV2 contract below
        SatelliteV2 satelliteV2 = SatelliteV2.deploy(web3j, transactionManager, gasProvider).send();

        //Call the upgrade function of the main contact using the address of the satelliteV2 contract
        mainContract.upgrade(satelliteV2.getContractAddress()).send();

        // Test the main contract by calling the getAge function
        assertEquals(satelliteV2.getAge().send().intValue(), 26);

    }

    @Test
    @Order(3)
    public void dataStoragePattern(Web3j web3j, TransactionManager transactionManager, ContractGasProvider gasProvider) throws Exception {
        //Deploy the DataStorage contract below
        DataStorage mainContract = DataStorage.deploy(web3j, transactionManager, gasProvider).send();

        //Deploy the userContract below
        UserContract userContract = UserContract.deploy(web3j, transactionManager, gasProvider).send();

        //In the userContract call the setStorageContract function using the userStorage address. This instructs the contract where to get and set data.
        userContract.setStorageContract(mainContract.getContractAddress()).send();

        //set age in userContract of first version
        userContract.setAge(BigInteger.TWO).send();

        //Deploy the userContractV2 below
        UserContractV2 userContractV2 = UserContractV2.deploy(web3j, transactionManager, gasProvider).send();

        //In the userContractV2 contract call the allowAccess function using the userContractV2 address. This will give the userContract permission to write to the DataStorage contract.

        //In the UserContractV2 call the setStorageContract function using the DataStorage address. This instructs the contract where to get and set data.
        userContractV2.setStorageContract(mainContract.getContractAddress()).send();

        assertEquals(userContractV2.getAge().send().intValue(), 2);

        try {
            //set age in userContract of second version
            userContractV2.setAge(new BigInteger("2")).send();
        } catch (TransactionException e) {
            assertNotNull(e.getMessage());
            System.out.println(e);
        }

    }
}
