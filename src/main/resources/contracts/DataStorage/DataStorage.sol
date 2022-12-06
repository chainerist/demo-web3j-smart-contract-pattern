// SPDX-License-Identifier: MIT
pragma solidity ^0.8.6;

//this contract is used to store data

contract DataStorage {

    //a mapping to determine which contract has access to write data to this contract
    //used in the modifier below
    uint private age;


    event CreateAgeEvent(address _owner, uint256 indexed age);

    //get the age from the age variable
    function getAge() public view returns (uint) {
        return age;
    }


    //set an age to the age variable
    //uses the isAllowed function modifier to determine if user can change data
    function setAge(uint newAge) public {
        age = newAge;
        emit CreateAgeEvent(msg.sender, newAge);

    }
}