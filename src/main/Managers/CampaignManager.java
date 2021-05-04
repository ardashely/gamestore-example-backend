package main.Managers;

import main.Entitys.Campaign;
import main.Entitys.Game;
import main.Services.CampaignService;
import main.Services.LoggerService;
import main.Tools.Runner;

public class CampaignManager implements CampaignService {

    private LoggerService[] loggerServices;


    public CampaignManager(LoggerService[] loggerServices) {
        this.loggerServices = loggerServices;
    }

    public CampaignManager() {}

    @Override
    public void add(Campaign campaign, Game game) {
        System.out.println("Yeni kampanya yayınlandı, bilgileri : " + campaign.getName() + " " + campaign.getDiscountRate() + " " + campaign.getTime());
        Runner.runLoggers(loggerServices, "Siteme yeni kampanya eklendi, bilgileri : " + campaign.getName() + " " + campaign.getDiscountRate() + " " + campaign.getTime());
    }

    @Override
    public void delete(Campaign campaign, Game game) {
        System.out.println("Bir kampanya bitti, bilgileri : " + campaign.getName() + " " + campaign.getDiscountRate() + " " + campaign.getTime());
        Runner.runLoggers(loggerServices, "Sitemden bir kampanya silindi, bilgileri : " + campaign.getName() + " " + campaign.getDiscountRate() + " " + campaign.getTime());
    }

    @Override
    public void updateName(Campaign campaign, Game game) {
        System.out.println("Bir kampanya ismi değiştirildi, güncel bilgi : " + campaign.getName());
        Runner.runLoggers(loggerServices, "Sistemdeki bir kampanyanın ismi değiştirildi, bilgileri : " + campaign.getID() + " " + campaign.getName());
    }

    @Override
    public void updateDiscountRate(Campaign campaign, Game game) {
        System.out.println("Bir kampanya indirim oranı değiştirildi, güncel bilgi : " + campaign.getDiscountRate());
        Runner.runLoggers(loggerServices, "Sistemdeki bir kampanyanın indirim oranı değiştirildi, bilgileri : " + campaign.getID() + " " + campaign.getDiscountRate());
    }

    @Override
    public void updateTime(Campaign campaign, Game game) {
        System.out.println("Bir kampanya süresi değiştirildi, güncel bilgi : " + campaign.getTime());
        Runner.runLoggers(loggerServices, "Sistemdeki bir kampanyanın ismi değiştirildi, bilgileri : " + campaign.getID() + " " + campaign.getTime());
    }
}