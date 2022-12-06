package com.chainerist.demo.smart.contract.pattern.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple5;
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
public class ProductV3 extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610b7f806100206000396000f3fe608060405234801561001057600080fd5b50600436106100935760003560e01c80639a198d61116100665780639a198d611461011b578063c368ec0614610123578063cfb519281461013b578063db33f3581461014e578063dc38b0a21461016157600080fd5b8063049760cf146100985780631dd78325146100c5578063313c6c58146100e65780639201de55146100fb575b600080fd5b6100ab6100a63660046106d6565b610191565b6040516100bc959493929190610795565b60405180910390f35b6100d86100d33660046107e0565b610234565b6040519081526020016100bc565b6100f96100f436600461082d565b6102bb565b005b61010e6101093660046108d4565b61036b565b6040516100bc91906108ed565b6100f96104a2565b61012b610508565b60405190151581526020016100bc565b6100d86101493660046107e0565b610589565b6100f961015c366004610900565b6105a6565b6100f961016f36600461095b565b600080546001600160a01b0319166001600160a01b0392909216919091179055565b6000805460405163049760cf60e01b81526060918291849182916001600160a01b039091169063049760cf906101cd908a908a90600401610984565b60006040518083038186803b1580156101e557600080fd5b505afa1580156101f9573d6000803e3d6000fd5b505050506040513d6000823e601f3d908101601f1916820160405261022191908101906109eb565b939b929a50909850965090945092505050565b60008054604051631dd7832560e01b81526001600160a01b0390911690631dd78325906102659085906004016108ed565b60206040518083038186803b15801561027d57600080fd5b505afa158015610291573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906102b59190610a69565b92915050565b60006102c685610589565b506020116102d357600080fd5b600a8210156102e157600080fd5b60006102ec84610589565b50602010156102fa57600080fd5b6000546040516306278d8b60e31b81526001600160a01b039091169063313c6c58906103329088908890889088908890600401610a82565b600060405180830381600087803b15801561034c57600080fd5b505af1158015610360573d6000803e3d6000fd5b505050505050505050565b606060005b60208160ff161080156103a45750828160ff166020811061039357610393610abb565b1a60f81b6001600160f81b03191615155b156103bb57806103b381610ad1565b915050610370565b60008160ff1667ffffffffffffffff8111156103d9576103d9610611565b6040519080825280601f01601f191660200182016040528015610403576020820181803683370190505b509050600091505b60208260ff1610801561043f5750838260ff166020811061042e5761042e610abb565b1a60f81b6001600160f81b03191615155b1561049b57838260ff166020811061045957610459610abb565b1a60f81b818360ff168151811061047257610472610abb565b60200101906001600160f81b031916908160001a9053508161049381610ad1565b92505061040b565b9392505050565b600054604051630135b22d60e11b8152336004820152600160248201526001600160a01b039091169063026b645a90604401600060405180830381600087803b1580156104ee57600080fd5b505af1158015610502573d6000803e3d6000fd5b50505050565b6000805460405163149fb79960e21b81523360048201526001600160a01b039091169063527ede649060240160206040518083038186803b15801561054c57600080fd5b505afa158015610560573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052508101906105849190610aff565b905090565b8051600090829061059d5750600092915050565b50506020015190565b600054604051631b667e6b60e31b81526001600160a01b039091169063db33f358906105da90869086908690600401610b21565b600060405180830381600087803b1580156105f457600080fd5b505af1158015610608573d6000803e3d6000fd5b50505050505050565b634e487b7160e01b600052604160045260246000fd5b604051601f8201601f1916810167ffffffffffffffff8111828210171561065057610650610611565b604052919050565b600067ffffffffffffffff82111561067257610672610611565b50601f01601f191660200190565b600082601f83011261069157600080fd5b81356106a461069f82610658565b610627565b8181528460208386010111156106b957600080fd5b816020850160208301376000918101602001919091529392505050565b600080604083850312156106e957600080fd5b823567ffffffffffffffff81111561070057600080fd5b61070c85828601610680565b95602094909401359450505050565b60005b8381101561073657818101518382015260200161071e565b838111156105025750506000910152565b6000815180845261075f81602086016020860161071b565b601f01601f19169290920160200192915050565b6003811061079157634e487b7160e01b600052602160045260246000fd5b9052565b85815260a0602082015260006107ae60a0830187610747565b82810360408401526107c08187610747565b9150508360608301526107d66080830184610773565b9695505050505050565b6000602082840312156107f257600080fd5b813567ffffffffffffffff81111561080957600080fd5b61081584828501610680565b949350505050565b6003811061082a57600080fd5b50565b600080600080600060a0868803121561084557600080fd5b853567ffffffffffffffff8082111561085d57600080fd5b61086989838a01610680565b9650602088013591508082111561087f57600080fd5b61088b89838a01610680565b955060408801359150808211156108a157600080fd5b506108ae88828901610680565b9350506060860135915060808601356108c68161081d565b809150509295509295909350565b6000602082840312156108e657600080fd5b5035919050565b60208152600061049b6020830184610747565b60008060006060848603121561091557600080fd5b833567ffffffffffffffff81111561092c57600080fd5b61093886828701610680565b9350506020840135915060408401356109508161081d565b809150509250925092565b60006020828403121561096d57600080fd5b81356001600160a01b038116811461049b57600080fd5b6040815260006109976040830185610747565b90508260208301529392505050565b600082601f8301126109b757600080fd5b81516109c561069f82610658565b8181528460208386010111156109da57600080fd5b61081582602083016020870161071b565b600080600080600060a08688031215610a0357600080fd5b85519450602086015167ffffffffffffffff80821115610a2257600080fd5b610a2e89838a016109a6565b95506040880151915080821115610a4457600080fd5b50610a51888289016109a6565b9350506060860151915060808601516108c68161081d565b600060208284031215610a7b57600080fd5b5051919050565b60a081526000610a9560a0830188610747565b8281036020840152610aa78188610747565b905082810360408401526107c08187610747565b634e487b7160e01b600052603260045260246000fd5b600060ff821660ff811415610af657634e487b7160e01b600052601160045260246000fd5b60010192915050565b600060208284031215610b1157600080fd5b8151801515811461049b57600080fd5b606081526000610b346060830186610747565b9050836020830152610815604083018461077356fea26469706673582212200730fbb49ed2b937555f8a3ceba54402cd832469db54736cddfcb08fe7af8ab964736f6c63430008090033";

    public static final String FUNC_BYTES32TOSTRING = "bytes32ToString";

    public static final String FUNC_CHANGE_STATUS = "change_status";

    public static final String FUNC_CREATEPRODUCT = "createProduct";

    public static final String FUNC_GETPRODUCT = "getProduct";

    public static final String FUNC_GETPRODUCTCOUNT = "getProductCount";

    public static final String FUNC_ISMYUSERNAMEREGISTERED = "isMyUserNameRegistered";

    public static final String FUNC_REGISTERME = "registerMe";

    public static final String FUNC_SETSTORAGECONTRACT = "setStorageContract";

    public static final String FUNC_STRINGTOBYTES32 = "stringToBytes32";

    @Deprecated
    protected ProductV3(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ProductV3(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ProductV3(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ProductV3(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> bytes32ToString(byte[] _bytes32) {
        final Function function = new Function(FUNC_BYTES32TOSTRING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_bytes32)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> change_status(String _owner, BigInteger _index, BigInteger _pro_state) {
        final Function function = new Function(
                FUNC_CHANGE_STATUS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_index), 
                new org.web3j.abi.datatypes.generated.Uint8(_pro_state)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> createProduct(String _owner, String _name, String _serialNo, BigInteger _price, BigInteger _pro_state) {
        final Function function = new Function(
                FUNC_CREATEPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_serialNo), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint8(_pro_state)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple5<BigInteger, String, String, BigInteger, BigInteger>> getProduct(String _address, BigInteger index) {
        final Function function = new Function(FUNC_GETPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_address), 
                new org.web3j.abi.datatypes.generated.Uint256(index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint8>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, String, String, BigInteger, BigInteger>>(function,
                new Callable<Tuple5<BigInteger, String, String, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple5<BigInteger, String, String, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, String, String, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getProductCount(String _owner) {
        final Function function = new Function(FUNC_GETPRODUCTCOUNT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> isMyUserNameRegistered() {
        final Function function = new Function(FUNC_ISMYUSERNAMEREGISTERED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> registerMe() {
        final Function function = new Function(
                FUNC_REGISTERME, 
                Arrays.<Type>asList(), 
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

    public RemoteFunctionCall<byte[]> stringToBytes32(String source) {
        final Function function = new Function(FUNC_STRINGTOBYTES32, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(source)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    @Deprecated
    public static ProductV3 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ProductV3(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ProductV3 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ProductV3(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ProductV3 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ProductV3(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ProductV3 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ProductV3(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ProductV3> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ProductV3.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ProductV3> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ProductV3.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<ProductV3> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ProductV3.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ProductV3> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ProductV3.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
