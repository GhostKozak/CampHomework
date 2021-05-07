package gameproject;

public class CustomerManager implements CustomerService {

    CustomerVerificationService customerVerificationService;

    CustomerManager(CustomerVerificationService _customerVerificationService) {
        this.customerVerificationService = _customerVerificationService;
    }

    @Override
    public void add(Customer customer) {

        if (customerVerificationService.tcDogrula(customer)) {
            System.out.println(customer.getFirstName() + " adlı kullanıcı sisteme eklendi");
            System.out.println("Kimlik numarası doğrulandı");
        } else {
            System.out.println(customer.getFirstName() + " adlı kullanıcı sisteme eklenemedi");
            System.out.println("Kimlik numarası doğrulanamadı");
        }
    }

    @Override
    public void remove(Customer customer) {
        System.out.println(customer.getFirstName() + " adlı kullanıcı sistemden kaldırıldı");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " adlı kullanıcının bilgileri güncellendi");
    }
}
