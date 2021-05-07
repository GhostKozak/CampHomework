package gameproject;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " adlı kampanya sisteme eklendi");
    }

    @Override
    public void remove(Campaign campaign) {
        System.out.println(campaign.getName() + " adlı kampanya sistemden kaldırıldı");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " adlı kampanya bilgileri güncellendi");
    }
}
