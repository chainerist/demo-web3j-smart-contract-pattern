// SPDX-License-Identifier: MIT
pragma solidity ^0.8.6;

import "./DataStorage.sol";

//logic is in the UserContract and data storage is in the UserStorage contract
//if we want to upgrade the userContract we can and will not loose any data

contract UserContract {

    DataStorage dataStorage;

    //set the address of the storage contract that this contract should user
    //all functions will read and write data to this contract
    function setStorageContract(address _storageAddress) public {
        dataStorage = DataStorage(_storageAddress);
    }


    //set the age in the storage contract
    function setAge(uint newAge) public {
        dataStorage.setAge(newAge);
    }


    //get the age in the storage contract
    function getAge() public view returns (uint){
        return dataStorage.getAge();
    }
}