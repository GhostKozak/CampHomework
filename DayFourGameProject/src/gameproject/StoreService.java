package gameproject;

public interface StoreService {
    void sellGame(Game game, Customer customer);
    void sellGameWithCamping(Game game, Customer customer, Campaign campaign);
}
