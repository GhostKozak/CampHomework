package gameproject;

import Mernis.AGUKPSPublicSoap;

public class MernisVerificationManager implements CustomerVerificationService {
    AGUKPSPublicSoap client = new AGUKPSPublicSoap();

    @Override
    public boolean tcDogrula(Customer customer) {
        boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(
                    Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getYearOfBirth()
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Mernis doğruluma düzgün çalışmadı");
        }
        return result;
    }
}
