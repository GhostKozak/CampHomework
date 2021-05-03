package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements ICustomerCheckService {
	public MernisServiceAdapter() {
		System.out.println("Mernis doğrulaması gerçekleşti");
	}

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result = false;
        try {
        	result = client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityID()),
                    customer.getFirstName(),
                    customer.getLastName(),
                    Integer.parseInt(customer.getDateOfBirth())
            );
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
        System.out.println("Mernisten dönen deger : " + result);
        return result;
    }
}
