package com.chainerist.demo.smart.contract.pattern.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
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
public class Example extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5061021f806100206000396000f3fe608060405234801561001057600080fd5b506004361061004b5760003560e01c80620267a4146100505780634ef65c3b146100655780638129fc1c1461007a578063cabfb934146100be575b600080fd5b60025460405190815260200160405180910390f35b610078610073366004610165565b600255565b005b6100786199e960e21b600090815260209081527ff100d83efb8cc6618b5b684fbdfd1b345c06da3f680f68637d5096ea7f246d4c805463ffffffff19169091179055565b6100786100cc36600461017e565b600180546001600160a01b0383166001600160a01b0319909116811790915560408051600481526024810182526020810180516001600160e01b031663204a7f0760e21b179052905161011f91906101ae565b600060405180830381855af49150503d806000811461015a576040519150601f19603f3d011682016040523d82523d6000602084013e61015f565b606091505b50505050565b60006020828403121561017757600080fd5b5035919050565b60006020828403121561019057600080fd5b81356001600160a01b03811681146101a757600080fd5b9392505050565b6000825160005b818110156101cf57602081860181015185830152016101b5565b818111156101de576000828501525b50919091019291505056fea26469706673582212203c9c3abe87d35f0f1e224a3ea7dedba0b16004c0519554e7caca8578518e836864736f6c63430008090033";

    public static final String FUNC_GETUINT = "getUint";

    public static final String FUNC_INITIALIZE = "initialize";

    public static final String FUNC_REPLACE = "replace";

    public static final String FUNC_SETUINT = "setUint";

    @Deprecated
    protected Example(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Example(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Example(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Example(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> getUint() {
        final Function function = new Function(FUNC_GETUINT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> initialize() {
        final Function function = new Function(
                FUNC_INITIALIZE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> replace(String target) {
        final Function function = new Function(
                FUNC_REPLACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, target)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setUint(BigInteger value) {
        final Function function = new Function(
                FUNC_SETUINT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Example load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Example(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Example load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Example(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Example load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Example(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Example load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Example(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Example> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Example.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Example> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Example.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Example> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Example.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Example> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Example.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
