package com.chainerist.demo.smart.contract.pattern.generated;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class DataStorage extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5060e88061001f6000396000f3fe6080604052348015600f57600080fd5b506004361060325760003560e01c8063967e6e65146037578063d5dcf12714604c575b600080fd5b60005460405190815260200160405180910390f35b605b6057366004609a565b605d565b005b600081905560405133815281907fba26ca9caeac46cee51d8018b4177648258e2356d1494eb865ca49422e81c3249060200160405180910390a250565b60006020828403121560ab57600080fd5b503591905056fea264697066735822122006d00b970015bf01de3c2d3bdc9b2dc4fdc7fd819f12f0eb198f82657d34014964736f6c63430008090033";

    public static final String FUNC_GETAGE = "getAge";

    public static final String FUNC_SETAGE = "setAge";

    public static final Event CREATEAGEEVENT_EVENT = new Event("CreateAgeEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>(true) {}));
    ;

    @Deprecated
    protected DataStorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DataStorage(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected DataStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected DataStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<CreateAgeEventEventResponse> getCreateAgeEventEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CREATEAGEEVENT_EVENT, transactionReceipt);
        ArrayList<CreateAgeEventEventResponse> responses = new ArrayList<CreateAgeEventEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
            CreateAgeEventEventResponse typedResponse = new CreateAgeEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.age = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse._owner = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CreateAgeEventEventResponse> createAgeEventEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CreateAgeEventEventResponse>() {
            @Override
            public CreateAgeEventEventResponse apply(Log log) {
                EventValuesWithLog eventValues = extractEventParametersWithLog(CREATEAGEEVENT_EVENT, log);
                CreateAgeEventEventResponse typedResponse = new CreateAgeEventEventResponse();
                typedResponse.log = log;
                typedResponse.age = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse._owner = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CreateAgeEventEventResponse> createAgeEventEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CREATEAGEEVENT_EVENT));
        return createAgeEventEventFlowable(filter);
    }

    public RemoteFunctionCall<BigInteger> getAge() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAge(BigInteger newAge) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETAGE, 
                Arrays.<Type>asList(new Uint256(newAge)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static DataStorage load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DataStorage(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static DataStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DataStorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static DataStorage load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new DataStorage(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static DataStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new DataStorage(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<DataStorage> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(DataStorage.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DataStorage> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DataStorage.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<DataStorage> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(DataStorage.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<DataStorage> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(DataStorage.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class CreateAgeEventEventResponse extends BaseEventResponse {
        public BigInteger age;

        public String _owner;
    }
}
