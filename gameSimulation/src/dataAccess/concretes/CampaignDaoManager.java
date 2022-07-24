package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.concrete.Campaign;
import entities.concrete.Game;

public class CampaignDaoManager implements CampaignDao {
    @Override
    public void add(Campaign campaign, Game game) {
        System.out.println("Kampanya eklendi -->"+ campaign.getName());
    }

    @Override
    public void update(Campaign campaign, Game game) {
    System.out.println("Kampanya güncellendi-->"+ campaign.getName());
    }

    @Override
    public void delete(Campaign campaign, Game game) {
    System.out.println("Kampanya silindi-->"+campaign.getName());
    }
}
