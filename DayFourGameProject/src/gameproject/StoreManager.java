package gameproject;

public class StoreManager implements StoreService {
    @Override
    public void sellGame(Game game, Customer customer) {
        System.out.println(game.getGameName() + " adlı ürün " + customer.getFirstName() + " adlı kullanıcı tarafından " + game.getPrice() + "TL'ye satın alınmıştır");
    }

    @Override
    public void sellGameWithCamping(Game game, Customer customer, Campaign campaign) {
        double priceWithDiscount = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
        System.out.println(game.getGameName() + " adlı ürün " + customer.getFirstName() + " adlı kullanıcı tarafından " + campaign.getName() + " adlı kampanya kullanılarak " + priceWithDiscount + "TL'ye satın alınmıştır");
    }
}
