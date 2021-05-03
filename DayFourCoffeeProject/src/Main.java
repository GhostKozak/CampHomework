import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer();
	    customer.setId(1);
	    customer.setFirstName("Gökhan");
	    customer.setLastName("Tanrıverdi");
	    customer.setNationalityID("38194640870");
	    customer.setDateOfBirth("1998");

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
    }
}
