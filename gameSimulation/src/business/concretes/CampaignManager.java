package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concrete.Campaign;
import entities.concrete.Game;

public class CampaignManager implements CampaignService {
    CampaignDao campaignDao;

    public CampaignManager(CampaignDao campaignDao){
        this.campaignDao = campaignDao;
    }

    @Override
    public void add(Campaign campaign, Game game) {
        campaignDao.add(campaign,game);
    }

    @Override
    public void update(Campaign campaign, Game game) {
        campaignDao.update(campaign,game);
    }

    @Override
    public void delete(Campaign campaign, Game game) {
    campaignDao.delete(campaign,game);
    }

    public double hesapla(Campaign campaign, Game game){
        return (1-campaign.getDiscountRate())*game.getUnitPrice();
    }
}
