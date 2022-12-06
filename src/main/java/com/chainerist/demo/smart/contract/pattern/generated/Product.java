package com.chainerist.demo.smart.contract.pattern.generated;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

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
public class Product extends Contract {
    public static final String BINARY = "60a06040526000805534801561001457600080fd5b50336080526080516109e861003460003960006104f701526109e86000f3fe608060405234801561001057600080fd5b506004361061007d5760003560e01c80639201de551161005b5780639201de55146100e5578063cfb5192814610105578063db33f35814610118578063e0f6ef871461012b57600080fd5b8063049760cf146100825780631dd78325146100af578063313c6c58146100d0575b600080fd5b610095610090366004610662565b610134565b6040516100a695949392919061072c565b60405180910390f35b6100c26100bd366004610777565b6101c0565b6040519081526020016100a6565b6100e36100de3660046107c8565b6101e6565b005b6100f86100f336600461086b565b610398565b6040516100a69190610884565b6100c2610113366004610777565b6104cf565b6100e3610126366004610897565b6104ec565b6100c260005481565b600060608060008060006001600061014b8a6104cf565b8152602001908152602001600020878154811061016a5761016a6108ee565b90600052602060002090600502019050806000015461018c8260010154610398565b6101998360020154610398565b6003840154600490940154929b919a509850919650600160a01b900460ff16945092505050565b6000600160006101cf846104cf565b815260208101919091526040016000205492915050565b60006101f1856104cf565b905060006101fe856104cf565b90506102366040805160c08101825260008082526020820181905291810182905260608101829052608081018290529060a082015290565b6000805490806102458361091a565b90915550815260208101839052604081018290526060810185905233608082015260a0810184600281111561027c5761027c6106f4565b9081600281111561028f5761028f6106f4565b9052506001600061029f8a6104cf565b81526020808201929092526040908101600090812080546001818101835591835291849020855160059093020191825592840151928101929092558201516002808301919091556060830151600383015560808301516004830180546001600160a01b039092166001600160a01b031983168117825560a086015186959490936001600160a81b03191690911790600160a01b908490811115610344576103446106f4565b021790555050507f2f8f0d12553b6a7ac4f331a80fd712085bff36f5a8baff70bd0cab6f46a1674b600054888888338960405161038696959493929190610935565b60405180910390a15050505050505050565b606060005b60208160ff161080156103d15750828160ff16602081106103c0576103c06108ee565b1a60f81b6001600160f81b03191615155b156103e857806103e081610992565b91505061039d565b60008160ff1667ffffffffffffffff811115610406576104066105bf565b6040519080825280601f01601f191660200182016040528015610430576020820181803683370190505b509050600091505b60208260ff1610801561046c5750838260ff166020811061045b5761045b6108ee565b1a60f81b6001600160f81b03191615155b156104c857838260ff1660208110610486576104866108ee565b1a60f81b818360ff168151811061049f5761049f6108ee565b60200101906001600160f81b031916908160001a905350816104c081610992565b925050610438565b9392505050565b805160009082906104e35750600092915050565b50506020015190565b336001600160a01b037f000000000000000000000000000000000000000000000000000000000000000016146105555760405162461bcd60e51b815260206004820152600a60248201526927b7363c9027bbb732b960b11b604482015260640160405180910390fd5b8060016000610563866104cf565b81526020019081526020016000208381548110610582576105826108ee565b60009182526020909120600460059092020101805460ff60a01b1916600160a01b8360028111156105b5576105b56106f4565b0217905550505050565b634e487b7160e01b600052604160045260246000fd5b600082601f8301126105e657600080fd5b813567ffffffffffffffff80821115610601576106016105bf565b604051601f8301601f19908116603f01168101908282118183101715610629576106296105bf565b8160405283815286602085880101111561064257600080fd5b836020870160208301376000602085830101528094505050505092915050565b6000806040838503121561067557600080fd5b823567ffffffffffffffff81111561068c57600080fd5b610698858286016105d5565b95602094909401359450505050565b6000815180845260005b818110156106cd576020818501810151868301820152016106b1565b818111156106df576000602083870101525b50601f01601f19169290920160200192915050565b634e487b7160e01b600052602160045260246000fd5b6003811061072857634e487b7160e01b600052602160045260246000fd5b9052565b85815260a06020820152600061074560a08301876106a7565b828103604084015261075781876106a7565b91505083606083015261076d608083018461070a565b9695505050505050565b60006020828403121561078957600080fd5b813567ffffffffffffffff8111156107a057600080fd5b6107ac848285016105d5565b949350505050565b8035600381106107c357600080fd5b919050565b600080600080600060a086880312156107e057600080fd5b853567ffffffffffffffff808211156107f857600080fd5b61080489838a016105d5565b9650602088013591508082111561081a57600080fd5b61082689838a016105d5565b9550604088013591508082111561083c57600080fd5b50610849888289016105d5565b9350506060860135915061085f608087016107b4565b90509295509295909350565b60006020828403121561087d57600080fd5b5035919050565b6020815260006104c860208301846106a7565b6000806000606084860312156108ac57600080fd5b833567ffffffffffffffff8111156108c357600080fd5b6108cf868287016105d5565b935050602084013591506108e5604085016107b4565b90509250925092565b634e487b7160e01b600052603260045260246000fd5b634e487b7160e01b600052601160045260246000fd5b600060001982141561092e5761092e610904565b5060010190565b86815260c06020820152600061094e60c08301886106a7565b828103604084015261096081886106a7565b606084018790526001600160a01b03861660808501529150610987905060a083018461070a565b979650505050505050565b600060ff821660ff8114156109a9576109a9610904565b6001019291505056fea2646970667358221220eac26212179bcbd2885fed87104ede75db77ab60574ab774b50d0b8f2ff568d464736f6c63430008090033";

    public static final String FUNC_BYTES32TOSTRING = "bytes32ToString";

    public static final String FUNC_CHANGE_STATUS = "change_status";

    public static final String FUNC_CREATEPRODUCT = "createProduct";

    public static final String FUNC_GETPRODUCT = "getProduct";

    public static final String FUNC_GETPRODUCTCOUNT = "getProductCount";

    public static final String FUNC_PRODUCTCOUNT = "productCount";

    public static final String FUNC_STRINGTOBYTES32 = "stringToBytes32";

    public static final Event PRODUCTCREATED_EVENT = new Event("ProductCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint8>() {}));
    ;

    @Deprecated
    protected Product(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Product(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Product(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Product(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<ProductCreatedEventResponse> getProductCreatedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = staticExtractEventParametersWithLog(PRODUCTCREATED_EVENT, transactionReceipt);
        ArrayList<ProductCreatedEventResponse> responses = new ArrayList<ProductCreatedEventResponse>(valueList.size());
        for (EventValuesWithLog eventValues : valueList) {
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
                EventValuesWithLog eventValues = extractEventParametersWithLog(PRODUCTCREATED_EVENT, log);
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

    public RemoteFunctionCall<String> bytes32ToString(byte[] _bytes32) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_BYTES32TOSTRING, 
                Arrays.<Type>asList(new Bytes32(_bytes32)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> change_status(String _owner, BigInteger _index, BigInteger _pro_state) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CHANGE_STATUS, 
                Arrays.<Type>asList(new Utf8String(_owner),
                new Uint256(_index),
                new Uint8(_pro_state)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> createProduct(String _owner, String _name, String _serialNo, BigInteger _price, BigInteger _pro_state) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CREATEPRODUCT, 
                Arrays.<Type>asList(new Utf8String(_owner),
                new Utf8String(_name),
                new Utf8String(_serialNo),
                new Uint256(_price),
                new Uint8(_pro_state)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple5<BigInteger, String, String, BigInteger, BigInteger>> getProduct(String _address, BigInteger index) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETPRODUCT, 
                Arrays.<Type>asList(new Utf8String(_address),
                new Uint256(index)),
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
                Arrays.<Type>asList(new Utf8String(_owner)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> productCount() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_PRODUCTCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<byte[]> stringToBytes32(String source) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_STRINGTOBYTES32, 
                Arrays.<Type>asList(new Utf8String(source)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    @Deprecated
    public static Product load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Product(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Product load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Product(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Product load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Product(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Product load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Product(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Product> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Product.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Product> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Product.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Product> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Product.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Product> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Product.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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
