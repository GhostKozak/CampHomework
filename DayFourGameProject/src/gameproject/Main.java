package gameproject;

public class Main {

    public static void main(String[] args) {
        Customer ghostkozak = new Customer();
        ghostkozak.setId(1);
        ghostkozak.setFirstName("Gökhan");
        ghostkozak.setLastName("Tanrıverdi");
        ghostkozak.setEmail("codeodd3@gmail.com");
        ghostkozak.setYearOfBirth(1998);
        ghostkozak.setNationalityId("333");

        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setName("Black Era");
        campaign.setDiscount(10.00);

        Game game1 = new Game();
        game1.setId(1);
        game1.setGameName("Undertale");
        game1.setPrice(18.00);

        Game game2 = new Game();
        game2.setId(2);
        game2.setGameName("Dragon Quest Builder 2");
        game2.setPrice(290.00);

        CustomerManager customerManager = new CustomerManager(new CustomerVerificationManager());
        customerManager.add(ghostkozak);

        System.out.println("-----------------------------------------");

        GameManager gameManager = new GameManager();
        gameManager.addGame(game1);

        System.out.println("-----------------------------------------");

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);

        System.out.println("-----------------------------------------");

        StoreManager storeManager = new StoreManager();
        storeManager.sellGame(game1,ghostkozak);

        storeManager.sellGameWithCamping(game2, ghostkozak, campaign);
    }
}
