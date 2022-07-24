package dataAccess.abstracts;

import entities.concrete.Campaign;
import entities.concrete.Game;

public interface CampaignDao {
    void add(Campaign campaign, Game game);
    void update(Campaign campaign, Game game);
    void delete(Campaign campaign, Game game);
}
