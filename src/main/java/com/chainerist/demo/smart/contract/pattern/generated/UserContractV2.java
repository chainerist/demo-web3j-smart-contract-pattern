package com.chainerist.demo.smart.contract.pattern.generated;

import org.web3j.abi.TypeReference;
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

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

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
public class UserContractV2 extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5061024c806100206000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c8063967e6e6514610046578063d5dcf12714610060578063dc38b0a214610075575b600080fd5b61004e6100a5565b60405190815260200160405180910390f35b61007361006e3660046101b4565b610131565b005b6100736100833660046101cd565b600080546001600160a01b0319166001600160a01b0392909216919091179055565b60008060009054906101000a90046001600160a01b03166001600160a01b031663967e6e656040518163ffffffff1660e01b815260040160206040518083038186803b1580156100f457600080fd5b505afa158015610108573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525081019061012c91906101fd565b905090565b601281101561015357604051631ac718d960e11b815260040160405180910390fd5b60005460405163d5dcf12760e01b8152600481018390526001600160a01b039091169063d5dcf12790602401600060405180830381600087803b15801561019957600080fd5b505af11580156101ad573d6000803e3d6000fd5b5050505050565b6000602082840312156101c657600080fd5b5035919050565b6000602082840312156101df57600080fd5b81356001600160a01b03811681146101f657600080fd5b9392505050565b60006020828403121561020f57600080fd5b505191905056fea26469706673582212205581dd353a2143b73c7de5e4245dcfaa9aa793c12d5c3dccd0a49b9c38bfdbef64736f6c63430008090033";

    public static final String FUNC_GETAGE = "getAge";

    public static final String FUNC_SETAGE = "setAge";

    public static final String FUNC_SETSTORAGECONTRACT = "setStorageContract";

    @Deprecated
    protected UserContractV2(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UserContractV2(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected UserContractV2(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected UserContractV2(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> getAge() {
        final Function function = new Function(FUNC_GETAGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAge(BigInteger newAge) {
        final Function function = new Function(
                FUNC_SETAGE, 
                Arrays.<Type>asList(new Uint256(newAge)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setStorageContract(String _storageAddress) {
        final Function function = new Function(
                FUNC_SETSTORAGECONTRACT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _storageAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static UserContractV2 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UserContractV2(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static UserContractV2 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UserContractV2(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static UserContractV2 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new UserContractV2(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static UserContractV2 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new UserContractV2(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<UserContractV2> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UserContractV2.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UserContractV2> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UserContractV2.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<UserContractV2> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UserContractV2.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UserContractV2> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UserContractV2.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
