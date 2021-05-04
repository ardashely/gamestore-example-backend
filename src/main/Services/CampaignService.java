package main.Services;

import main.Entitys.Campaign;
import main.Entitys.Game;

public interface CampaignService {
    void add(Campaign campaign, Game game);
    void delete(Campaign campaign, Game game);
    void updateName(Campaign campaign, Game game);
    void updateDiscountRate(Campaign campaign, Game game);
    void updateTime(Campaign campaign, Game game);
}
