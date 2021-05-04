package main;

import main.Entitys.Campaign;
import main.Entitys.User;
import main.Entitys.Game;
import main.Managers.AdminGameManager;
import main.Managers.CampaignManager;
import main.Managers.UserGameManager;
import main.Managers.UserManager;
import main.Tools.DataBaseLogger;
import main.Services.LoggerService;

public class Main {

    public static void main(String[] args) {

        LoggerService[] loggerServices = { new DataBaseLogger() /* new EmailLogger() */ };


        User user = new User(1,"99999999999", "Arda", "Aydın", "12.12.2003");
        Game  game = new Game(1, "CSGO", "FPS Game", 75);
        Campaign campaign = new Campaign(1, "Yaz Fırsatları", "1 Month", "%20");


        UserManager userManager = new UserManager(loggerServices);
        AdminGameManager adminGameManager = new AdminGameManager(loggerServices);
        UserGameManager userGameManager = new UserGameManager(loggerServices, user);
        CampaignManager campaignManager = new CampaignManager(loggerServices);



        userManager.register(user);
        userManager.delete(user);
        userManager.updateIdentificationNumber(user);
        userManager.updateFirstName(user);
        userManager.updateLastName(user);
        userManager.updateBirthDay(user);

        adminGameManager.add(game);
        adminGameManager.delete(game);
        adminGameManager.updateName(game);
        adminGameManager.updateDescreption(game);
        adminGameManager.updateUnitPrice(game);

        userGameManager.buy(game);
        userGameManager.addCommet(game);
        userGameManager.addCommet(game);

        campaignManager.add(campaign, game);
        campaignManager.delete(campaign, game);
        campaignManager.updateName(campaign, game);
        campaignManager.updateDiscountRate(campaign, game);
        campaignManager.updateTime(campaign, game);

    }
}