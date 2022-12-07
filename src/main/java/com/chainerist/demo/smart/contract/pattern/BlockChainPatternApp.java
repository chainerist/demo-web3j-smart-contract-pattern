package com.chainerist.demo.smart.contract.pattern;

import com.chainerist.demo.smart.contract.pattern.generated.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;

import java.io.File;
import java.math.BigInteger;

@SpringBootApplication
public class BlockChainPatternApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BlockChainPatternApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Web3j web3j = Web3j.build(new HttpService("http://localhost:8487"));
        Credentials wallet = WalletUtils.loadCredentials("123456", new File("wallet.json"));
        TransactionManager txn = new RawTransactionManager(web3j, wallet, 2730);
     //   Product product = Product.deploy(web3j, txn, Product.GAS_PRICE, Product.GAS_LIMIT).send();

       //xxw System.out.println("contract address " + product.getContractAddress() + " txn " + product.getTransactionReceipt().get().getTransactionHash());

        Product contract = Product.load("0x1f20831b7aca7ed2b4603bd1e35d158b60ef3b89", web3j, txn, Product.GAS_PRICE, Product.GAS_LIMIT);

        TransactionReceipt productTxn = contract.createProduct("UGR", "IPHONE15", "34853485853465", new BigInteger("500"), BigInteger.ZERO).send();
        System.out.println("txn " + productTxn.getTransactionHash());

        Tuple5<BigInteger, String, String, BigInteger, BigInteger> productGet = contract.getProduct("UGR", BigInteger.ZERO).send();

        contract.change_status("UGR", BigInteger.ZERO, BigInteger.TWO).send();
        Tuple5<BigInteger, String, String, BigInteger, BigInteger> productGet2 = contract.getProduct("UGR", BigInteger.ZERO).send();

        System.out.println(contract.getProductCount("UGR").send());
    }
}
