package com.chainerist.demo.smart.contract.pattern.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

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
public class MainContract extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b0319163317905561022d806100326000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c80630900f0101461005157806319c6910314610066578063967e6e6514610096578063f851a440146100ac575b600080fd5b61006461005f3660046101ae565b6100bf565b005b600154610079906001600160a01b031681565b6040516001600160a01b0390911681526020015b60405180910390f35b61009e61012c565b60405190815260200161008d565b600054610079906001600160a01b031681565b6000546001600160a01b0316331461010a5760405162461bcd60e51b815260206004820152600a60248201526937b7363c9030b236b4b760b11b604482015260640160405180910390fd5b600180546001600160a01b0319166001600160a01b0392909216919091179055565b6001546040805163967e6e6560e01b815290516000926001600160a01b03169163967e6e65916004808301926020929190829003018186803b15801561017157600080fd5b505afa158015610185573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906101a991906101de565b905090565b6000602082840312156101c057600080fd5b81356001600160a01b03811681146101d757600080fd5b9392505050565b6000602082840312156101f057600080fd5b505191905056fea26469706673582212208a8368fa32b6dd6df5f56bb869f60d9113d8174f5feaad25c923eecd9469fc2f64736f6c63430008090033";

    public static final String FUNC_ADMIN = "admin";

    public static final String FUNC_BUSINESSLOGIC = "businesslogic";

    public static final String FUNC_GETAGE = "getAge";

    public static final String FUNC_UPGRADE = "upgrade";

    @Deprecated
    protected MainContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected MainContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected MainContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected MainContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> admin() {
        final Function function = new Function(FUNC_ADMIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> businesslogic() {
        final Function function = new Function(FUNC_BUSINESSLOGIC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> getAge() {
        final Function function = new Function(FUNC_GETAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> upgrade(String _businesslogic) {
        final Function function = new Function(
                FUNC_UPGRADE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _businesslogic)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static MainContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new MainContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static MainContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new MainContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static MainContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new MainContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static MainContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new MainContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<MainContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(MainContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<MainContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(MainContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<MainContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(MainContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<MainContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(MainContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
