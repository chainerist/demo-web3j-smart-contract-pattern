// SPDX-License-Identifier: MIT
pragma solidity ^0.8.6;

contract Product {

    enum ProductState {Shipped, Store, Sale}
    address immutable owner;
    uint public productCount = 0;


    modifier onlyOwner {
        require(msg.sender == owner,"Only Owner");
        _;
    }

    struct Product
    {
        uint id;
        bytes32 name;
        bytes32 serlialNo;
        uint price;
        address UpdatedBy;
        ProductState pro_state; //later change to ProductState
    }

    mapping(bytes32 => Product[]) OwnerOfProducts;

    event ProductCreated
    (
        uint id,
        string name,
        string serlialNo,
        uint price,
        address UpdatedBy,
        ProductState pro_state //later change to ProductState
    );

    constructor() public {
        owner = msg.sender;
    }

    function createProduct(string memory _owner, string memory _name, string memory _serialNo, uint _price, ProductState _pro_state) public {
        // Require a valid name

        bytes32 name = stringToBytes32(_name);

        bytes32 serialNo = stringToBytes32(_serialNo);

        require(name.length > 0);
        // Require a valid price
        require(_price >= 0);
        // Require a valid serlialNo
        require(serialNo.length >= 0);

        //Create new product
        Product memory p;
        //assign value to products
        p.id = productCount++;
        p.name = name;
        p.serlialNo = serialNo;
        p.price = _price;
        p.UpdatedBy = msg.sender;
        p.pro_state = _pro_state;

        OwnerOfProducts[stringToBytes32(_owner)].push(p);

        // Trigger an event
        emit ProductCreated(productCount, _name, _serialNo, _price, msg.sender, _pro_state );
    }

    function change_status(string memory _owner, uint256 _index, ProductState _pro_state)
    public
    onlyOwner
    {
        OwnerOfProducts[stringToBytes32(_owner)][_index].pro_state = _pro_state;

       // emit EventChangeStatus(_index, _pro_state);
    }

    function getProduct(string memory _address, uint index) view public returns(uint, string memory, string memory, uint, ProductState) {
        Product storage p = OwnerOfProducts[stringToBytes32(_address)][index];
        return(p.id, bytes32ToString(p.name), bytes32ToString(p.serlialNo), p.price, p.pro_state);
    }

    function getProductCount(string memory _owner) view public returns(uint){
        return OwnerOfProducts[stringToBytes32(_owner)].length;
    }


    function stringToBytes32(string memory source)
    public
    pure
    returns (bytes32 result)
    {
        bytes memory tempEmptyStringTest = bytes(source);
        if (tempEmptyStringTest.length == 0) {
            return 0x0;
        }

        assembly {
            result := mload(add(source, 32))
        }
    }

    function bytes32ToString(bytes32 _bytes32) public pure returns (string memory) {
        uint8 i = 0;
        while(i < 32 && _bytes32[i] != 0) {
            i++;
        }
        bytes memory bytesArray = new bytes(i);
        for (i = 0; i < 32 && _bytes32[i] != 0; i++) {
            bytesArray[i] = _bytes32[i];
        }
        return string(bytesArray);
    }
}