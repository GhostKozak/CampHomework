package gameproject;

public class CustomerVerificationManager implements CustomerVerificationService {
    // FAKE VERIFICATION SERVICE
    @Override
    public boolean tcDogrula(Customer customer) {
        return true;
    }
}
