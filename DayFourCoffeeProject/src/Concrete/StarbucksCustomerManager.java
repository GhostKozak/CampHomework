package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    ICustomerCheckService _cICustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this._cICustomerCheckService = iCustomerCheckService;
    }
    @Override
    public void save(Customer customer) {
        if (_cICustomerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person");
        }
    }
}
