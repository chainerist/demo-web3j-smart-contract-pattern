package com.chainerist.demo.smart.contract.pattern.generated;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
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
public class Dispatcher extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b5060405161034838038061034883398101604081905261002f916100d7565b6100388161003e565b50610142565b600180546001600160a01b0383166001600160a01b0319909116811790915560408051600481526024810182526020810180516001600160e01b031663204a7f0760e21b17905290516100919190610107565b600060405180830381855af49150503d80600081146100cc576040519150601f19603f3d011682016040523d82523d6000602084013e6100d1565b606091505b50505050565b6000602082840312156100e957600080fd5b81516001600160a01b038116811461010057600080fd5b9392505050565b6000825160005b81811015610128576020818601810151858301520161010e565b81811115610137576000828501525b509190910192915050565b6101f7806101516000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80638129fc1c14610080578063cabfb9341461008a575b600080356001600160e01b03198116825260208290526040822054600154919263ffffffff909116916001600160a01b03169036908037816000366000846127105a03f450816000f35b61008861009d565b005b610088610098366004610140565b6100a7565b6100a5610170565b565b600180546001600160a01b0383166001600160a01b0319909116811790915560408051600481526024810182526020810180516001600160e01b031663204a7f0760e21b17905290516100fa9190610186565b600060405180830381855af49150503d8060008114610135576040519150601f19603f3d011682016040523d82523d6000602084013e61013a565b606091505b50505050565b60006020828403121561015257600080fd5b81356001600160a01b038116811461016957600080fd5b9392505050565b634e487b7160e01b600052600160045260246000fd5b6000825160005b818110156101a7576020818601810151858301520161018d565b818111156101b6576000828501525b50919091019291505056fea2646970667358221220881331877eac198c77940c5ed31c5a6b16f96197aad2d6261b6e1d89297c40c164736f6c63430008090033";

    public static final String FUNC_INITIALIZE = "initialize";

    public static final String FUNC_REPLACE = "replace";

    @Deprecated
    protected Dispatcher(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Dispatcher(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Dispatcher(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Dispatcher(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
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

    @Deprecated
    public static Dispatcher load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Dispatcher(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Dispatcher load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Dispatcher(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Dispatcher load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Dispatcher(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Dispatcher load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Dispatcher(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Dispatcher> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String target) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, target)));
        return deployRemoteCall(Dispatcher.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Dispatcher> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String target) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, target)));
        return deployRemoteCall(Dispatcher.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Dispatcher> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String target) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, target)));
        return deployRemoteCall(Dispatcher.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Dispatcher> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String target) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, target)));
        return deployRemoteCall(Dispatcher.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
