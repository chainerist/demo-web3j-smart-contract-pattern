// SPDX-License-Identifier: MIT

pragma solidity ^0.8.6;
import "./Ibusinesslogic.sol";

contract SatelliteV2 is Ibusinesslogic {
    function getAge() override external pure returns(uint) {
        return 26;
    }
}