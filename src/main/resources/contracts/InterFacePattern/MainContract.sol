// SPDX-License-Identifier: MIT
import "./Ibusinesslogic.sol";

contract MainContract {
    //set an admin address
    address public admin;
    //interface contract address
    Ibusinesslogic public businesslogic;
    //the admin is the owner
    constructor() {
        admin = msg.sender;
    }


    //function to upgrade the contract to point to execute function
    function upgrade(address _businesslogic) external {
        require(msg.sender == admin, 'only admin');
        businesslogic = Ibusinesslogic(_businesslogic);
    }


    //call the getAge function using the businesslogic function
    function getAge() external view returns(uint) {
        return businesslogic.getAge();
    }
}