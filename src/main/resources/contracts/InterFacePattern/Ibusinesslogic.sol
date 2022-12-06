// SPDX-License-Identifier: MIT
pragma solidity ^0.8.6;

//defined interface needed to interact with other contract
interface Ibusinesslogic {
    function getAge() external pure returns(uint);
}
