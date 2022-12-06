package com.chainerist.demo.smart.contract.pattern.generated;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
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
public class ProductDataStorage extends Contract {
    public static final String BINARY = "60806040526000805534801561001457600080fd5b50336000908152600260205260409020805460ff19166001179055610c9c8061003e6000396000f3fe608060405234801561001057600080fd5b50600436106100a95760003560e01c806361afd5ac1161007157806361afd5ac146101605780639201de5514610173578063c4a85bc114610193578063cfb51928146101a6578063db33f358146101b9578063e0f6ef87146101cc57600080fd5b8063026b645a146100ae578063049760cf146100c35780631dd78325146100f0578063313c6c5814610111578063527ede6414610124575b600080fd5b6100c16100bc3660046107f4565b6101d5565b005b6100d66100d13660046108d3565b61023d565b6040516100e795949392919061099d565b60405180910390f35b6101036100fe3660046109e8565b6102fe565b6040519081526020016100e7565b6100c161011f366004610a34565b610358565b610150610132366004610ad7565b6001600160a01b031660009081526003602052604090205460ff1690565b60405190151581526020016100e7565b6100c161016e366004610ad7565b61053e565b610186610181366004610af2565b610593565b6040516100e79190610b0b565b6100c16101a1366004610ad7565b6106ca565b6101036101b43660046109e8565b610722565b6100c16101c7366004610b1e565b61073f565b61010360005481565b3360009081526002602052604090205460ff1615156001146102125760405162461bcd60e51b815260040161020990610b75565b60405180910390fd5b6001600160a01b03919091166000908152600360205260409020805460ff1916911515919091179055565b3360009081526002602052604081205460609081908390819060ff16151560011461027a5760405162461bcd60e51b815260040161020990610b75565b6000600160006102898a610722565b815260200190815260200160002087815481106102a8576102a8610ba2565b9060005260206000209060050201905080600001546102ca8260010154610593565b6102d78360020154610593565b6003840154600490940154929b919a509850919650600160a01b900460ff16945092505050565b3360009081526002602052604081205460ff1615156001146103325760405162461bcd60e51b815260040161020990610b75565b6001600061033f84610722565b815260208101919091526040016000205490505b919050565b3360009081526002602052604090205460ff16151560011461038c5760405162461bcd60e51b815260040161020990610b75565b600061039785610722565b905060006103a485610722565b90506103dc6040805160c08101825260008082526020820181905291810182905260608101829052608081018290529060a082015290565b6000805490806103eb83610bce565b90915550815260208101839052604081018290526060810185905233608082015260a0810184600281111561042257610422610965565b9081600281111561043557610435610965565b905250600160006104458a610722565b81526020808201929092526040908101600090812080546001818101835591835291849020855160059093020191825592840151928101929092558201516002808301919091556060830151600383015560808301516004830180546001600160a01b039092166001600160a01b031983168117825560a086015186959490936001600160a81b03191690911790600160a01b9084908111156104ea576104ea610965565b021790555050507f2f8f0d12553b6a7ac4f331a80fd712085bff36f5a8baff70bd0cab6f46a1674b600054888888338960405161052c96959493929190610be9565b60405180910390a15050505050505050565b3360009081526002602052604090205460ff1615156001146105725760405162461bcd60e51b815260040161020990610b75565b6001600160a01b03166000908152600260205260409020805460ff19169055565b606060005b60208160ff161080156105cc5750828160ff16602081106105bb576105bb610ba2565b1a60f81b6001600160f81b03191615155b156105e357806105db81610c46565b915050610598565b60008160ff1667ffffffffffffffff81111561060157610601610830565b6040519080825280601f01601f19166020018201604052801561062b576020820181803683370190505b509050600091505b60208260ff161080156106675750838260ff166020811061065657610656610ba2565b1a60f81b6001600160f81b03191615155b156106c357838260ff166020811061068157610681610ba2565b1a60f81b818360ff168151811061069a5761069a610ba2565b60200101906001600160f81b031916908160001a905350816106bb81610c46565b925050610633565b9392505050565b3360009081526002602052604090205460ff1615156001146106fe5760405162461bcd60e51b815260040161020990610b75565b6001600160a01b03166000908152600260205260409020805460ff19166001179055565b805160009082906107365750600092915050565b50506020015190565b3360009081526002602052604090205460ff1615156001146107735760405162461bcd60e51b815260040161020990610b75565b806001600061078186610722565b815260200190815260200160002083815481106107a0576107a0610ba2565b60009182526020909120600460059092020101805460ff60a01b1916600160a01b8360028111156107d3576107d3610965565b0217905550505050565b80356001600160a01b038116811461035357600080fd5b6000806040838503121561080757600080fd5b610810836107dd565b91506020830135801515811461082557600080fd5b809150509250929050565b634e487b7160e01b600052604160045260246000fd5b600082601f83011261085757600080fd5b813567ffffffffffffffff8082111561087257610872610830565b604051601f8301601f19908116603f0116810190828211818310171561089a5761089a610830565b816040528381528660208588010111156108b357600080fd5b836020870160208301376000602085830101528094505050505092915050565b600080604083850312156108e657600080fd5b823567ffffffffffffffff8111156108fd57600080fd5b61090985828601610846565b95602094909401359450505050565b6000815180845260005b8181101561093e57602081850181015186830182015201610922565b81811115610950576000602083870101525b50601f01601f19169290920160200192915050565b634e487b7160e01b600052602160045260246000fd5b6003811061099957634e487b7160e01b600052602160045260246000fd5b9052565b85815260a0602082015260006109b660a0830187610918565b82810360408401526109c88187610918565b9150508360608301526109de608083018461097b565b9695505050505050565b6000602082840312156109fa57600080fd5b813567ffffffffffffffff811115610a1157600080fd5b610a1d84828501610846565b949350505050565b80356003811061035357600080fd5b600080600080600060a08688031215610a4c57600080fd5b853567ffffffffffffffff80821115610a6457600080fd5b610a7089838a01610846565b96506020880135915080821115610a8657600080fd5b610a9289838a01610846565b95506040880135915080821115610aa857600080fd5b50610ab588828901610846565b93505060608601359150610acb60808701610a25565b90509295509295909350565b600060208284031215610ae957600080fd5b6106c3826107dd565b600060208284031215610b0457600080fd5b5035919050565b6020815260006106c36020830184610918565b600080600060608486031215610b3357600080fd5b833567ffffffffffffffff811115610b4a57600080fd5b610b5686828701610846565b93505060208401359150610b6c60408501610a25565b90509250925092565b60208082526013908201527213db9b1e481858d8d95cdcc8185b1b1bddd959606a1b604082015260600190565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b6000600019821415610be257610be2610bb8565b5060010190565b86815260c060208201526000610c0260c0830188610918565b8281036040840152610c148188610918565b606084018790526001600160a01b03861660808501529150610c3b905060a083018461097b565b979650505050505050565b600060ff821660ff811415610c5d57610c5d610bb8565b6001019291505056fea2646970667358221220f1597df4bdad97eb137dd221ddc01cb3341ef53dc6c4b25342e63783b5376d6864736f6c63430008090033";

    public static final String FUNC_ALLOWACCESS = "allowAccess";

    public static final String FUNC_BYTES32TOSTRING = "bytes32ToString";

    public static final String FUNC_CHANGE_STATUS = "change_status";

    public static final String FUNC_CREATEPRODUCT = "createProduct";

    public static final String FUNC_DENYACCESS = "denyAccess";

    public static final String FUNC_GETADDRESSSET = "getAddressSet";

    public static final String FUNC_GETPRODUCT = "getProduct";

    public static final String FUNC_GETPRODUCTCOUNT = "getProductCount";

    public static final String FUNC_PRODUCTCOUNT = "productCount";

    public static final String FUNC_SETADDRESSSET = "setAddressSet";

    public static final String FUNC_STRINGTOBYTES32 = "stringToBytes32";

    public static final Event PRODUCTCREATED_EVENT = new Event("ProductCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint8>() {}));
    ;

    @Deprecated
    protected ProductDataStorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ProductDataStorage(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ProductDataStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ProductDataStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<ProductCreatedEventResponse> getProductCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(PRODUCTCREATED_EVENT, transactionReceipt);
        ArrayList<ProductCreatedEventResponse> responses = new ArrayList<ProductCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ProductCreatedEventResponse typedResponse = new ProductCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.name = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.serlialNo = (String) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse.UpdatedBy = (String) eventValues.getNonIndexedValues().get(4).getValue();
            typedResponse.pro_state = (BigInteger) eventValues.getNonIndexedValues().get(5).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ProductCreatedEventResponse> productCreatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ProductCreatedEventResponse>() {
            @Override
            public ProductCreatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PRODUCTCREATED_EVENT, log);
                ProductCreatedEventResponse typedResponse = new ProductCreatedEventResponse();
                typedResponse.log = log;
                typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.name = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.serlialNo = (String) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse.UpdatedBy = (String) eventValues.getNonIndexedValues().get(4).getValue();
                typedResponse.pro_state = (BigInteger) eventValues.getNonIndexedValues().get(5).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ProductCreatedEventResponse> productCreatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PRODUCTCREATED_EVENT));
        return productCreatedEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> allowAccess(String _address) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ALLOWACCESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> bytes32ToString(byte[] _bytes32) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_BYTES32TOSTRING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_bytes32)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> change_status(String _owner, BigInteger _index, BigInteger _pro_state) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CHANGE_STATUS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_index), 
                new org.web3j.abi.datatypes.generated.Uint8(_pro_state)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> createProduct(String _owner, String _name, String _serialNo, BigInteger _price, BigInteger _pro_state) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CREATEPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_serialNo), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint8(_pro_state)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> denyAccess(String _address) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_DENYACCESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> getAddressSet(String _address) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETADDRESSSET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Tuple5<BigInteger, String, String, BigInteger, BigInteger>> getProduct(String _address, BigInteger index) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETPRODUCT, 
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
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETPRODUCTCOUNT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> productCount() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_PRODUCTCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setAddressSet(String _address, Boolean _bool) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETADDRESSSET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address), 
                new org.web3j.abi.datatypes.Bool(_bool)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<byte[]> stringToBytes32(String source) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_STRINGTOBYTES32, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(source)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    @Deprecated
    public static ProductDataStorage load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ProductDataStorage(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ProductDataStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ProductDataStorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ProductDataStorage load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ProductDataStorage(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ProductDataStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ProductDataStorage(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ProductDataStorage> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ProductDataStorage.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<ProductDataStorage> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ProductDataStorage.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ProductDataStorage> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ProductDataStorage.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ProductDataStorage> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ProductDataStorage.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class ProductCreatedEventResponse extends BaseEventResponse {
        public BigInteger id;

        public String name;

        public String serlialNo;

        public BigInteger price;

        public String UpdatedBy;

        public BigInteger pro_state;
    }
}
