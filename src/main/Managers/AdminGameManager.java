package main.Managers;

import main.Entitys.Game;
import main.Services.AdminGameService;
import main.Tools.Runner;
import main.Services.LoggerService;

public class AdminGameManager implements AdminGameService {

    private LoggerService[] loggerServices;


    public AdminGameManager(LoggerService[] loggerServices) {
        this.loggerServices = loggerServices;
    }

    public AdminGameManager() {}

    @Override
    public void add(Game game) {
        System.out.println("Bir oyun eklendi : " + game.getID() + " " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
        Runner.runLoggers(loggerServices, "Eklenen oyun bilgi : " + game.getID() + " " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Bir oyun silindi : " + game.getID() + " " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
        Runner.runLoggers(loggerServices, "Silinen oyun bilgi : " + game.getID() + " " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
    }

    @Override
    public void updateName(Game game) {
        System.out.println("Bir oyun ismi güncelendi : " + game.getName());
        Runner.runLoggers(loggerServices, "Güncellenen oyun adı bilgi : " + game.getName());
    }

    @Override
    public void updateDescreption(Game game) {
        System.out.println("Bir oyun açıklaması güncelendi : " + game.getDescreption());
        Runner.runLoggers(loggerServices, "Güncellenen oyun açıklaması bilgi : " + game.getDescreption());
    }

    @Override
    public void updateUnitPrice(Game game) {
        System.out.println("Bir oyun fiyatı güncelendi : " + game.getUnitPrice());
        Runner.runLoggers(loggerServices, "Güncellenen oyun fiyatı bilgi : " + game.getUnitPrice());
    }
}
