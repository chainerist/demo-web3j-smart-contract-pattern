// SPDX-License-Identifier: MIT
pragma solidity ^0.8.6;

import "./ProductDataStorage.sol";

contract ProductV3 {

    ProductDataStorage dataStorage;

    function setStorageContract(address _storageAddress) public {
        dataStorage = ProductDataStorage(_storageAddress);
    }

    function isMyUserNameRegistered() public view returns(bool) {
        return dataStorage.getAddressSet(msg.sender);
    }


    //writes to the addressSet map in the UserStorage contract
    function registerMe() public {
        dataStorage.setAddressSet(msg.sender, true);
    }


    function createProduct(string memory _owner, string memory _name, string memory _serialNo, uint _price, ProductDataStorage.ProductState _pro_state) public {

        require(stringToBytes32(_name).length > 0);
        // Require a valid price
        require(_price >= 10);
        // Require a valid serlialNo
        require(stringToBytes32(_serialNo).length >= 0);

        dataStorage.createProduct(_owner, _name, _serialNo, _price, _pro_state);
    }

    function change_status(string memory _owner, uint256 _index, ProductDataStorage.ProductState _pro_state)
    public
    {
        dataStorage.change_status(_owner, _index, _pro_state);
    }

    function getProduct(string memory _address, uint index) view public returns (uint, string memory, string memory, uint, ProductDataStorage.ProductState) {
        return dataStorage.getProduct(_address, index);
    }

    function getProductCount(string memory _owner) view public returns (uint){
        return dataStorage.getProductCount(_owner);
    }

    function bytes32ToString(bytes32 _bytes32) public pure returns (string memory) {
        uint8 i = 0;
        while (i < 32 && _bytes32[i] != 0) {
            i++;
        }
        bytes memory bytesArray = new bytes(i);
        for (i = 0; i < 32 && _bytes32[i] != 0; i++) {
            bytesArray[i] = _bytes32[i];
        }
        return string(bytesArray);
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
}