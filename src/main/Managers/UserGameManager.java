package main.Managers;

import main.Entitys.Game;
import main.Entitys.User;
import main.Services.LoggerService;
import main.Services.UserGameService;
import main.Services.UserService;
import main.Tools.Runner;

public class UserGameManager implements UserGameService {

    private LoggerService[] loggerServices;

    private User user;

    public UserGameManager(LoggerService[] loggerServices, User user) {
        this.loggerServices = loggerServices;
        this.user = user;
    }

    public UserGameManager() {}

    @Override
    public void buy(Game game) {
        System.out.println(user.getID() + " " + user.getLastName() + " " + "Oyun satın alındı, bilgileri : " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
        Runner.runLoggers(loggerServices, user.getID() + " " + "ID'li kullanıcı oyunu satın aldı, oyun bilgileri : " + game.getID() + " " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
    }

    @Override
    public void giveBack(Game game) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Oyun iade etti, bilgileri : " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
        Runner.runLoggers(loggerServices, user.getID() + " " + "ID'li kullanıcı oyunu iade etti, oyun bilgileri : " + game.getID() + " " + game.getName() + " "  + game.getDescreption() + " " + game.getUnitPrice());
    }

    @Override
    public void addCommet(Game game) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + game.getName() + " " + "Adlı oyuna bir yorum ekledi");
        Runner.runLoggers(loggerServices, user.getID() + " ");
    }
}
