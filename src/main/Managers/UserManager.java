package main.Managers;

import main.Entitys.User;
import main.Services.UserService;
import main.Tools.Runner;
import main.Services.LoggerService;


public class UserManager implements UserService {

    private LoggerService[] loggerServices;


    public UserManager(LoggerService[] loggerServices) {
        this.loggerServices = loggerServices;
    }

    public UserManager() {}

    @Override
    public void register(User user) {
        System.out.println("Sisteme kayıt oldu : " + user.getFirstName() + " " + user.getLastName());
        Runner.runLoggers(loggerServices, "Güncel kayıt bilgi : " + user.getID() + " " + user.getIdentificationNumber() + " " + user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDay());
    }

    @Override
    public void delete(User user) {
        System.out.println("Sistemden silindi : " + user.getFirstName() + " " + user.getLastName());
        Runner.runLoggers(loggerServices, "Güncel silinme bilgi : " + user.getID() + " " + user.getIdentificationNumber() + " " + user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDay());
    }

    @Override
    public void updateFirstName(User user) {
        System.out.println("Adı değiştirildi : " + user.getFirstName());
        Runner.runLoggers(loggerServices, "Güncel ad bilgi : " + user.getFirstName());
    }

    @Override
    public void updateLastName(User user) {
        System.out.println("Soyadı değiştirildi : " + user.getLastName());
        Runner.runLoggers(loggerServices, "Güncel soyad bilgi : " + user.getLastName());
    }

    @Override
    public void updateBirthDay(User user) {
        System.out.println("Doğum tarihi değiştirildi : " + user.getBirthDay());
        Runner.runLoggers(loggerServices, "Güncel doğum tarihi bilgi : " + user.getBirthDay());
    }

    @Override
    public void updateIdentificationNumber(User user) {
        System.out.println("Kimlik numarası değiştirili : " + user.getIdentificationNumber());
        Runner.runLoggers(loggerServices, "Güncel kimlik numara bilgi : " + user.getIdentificationNumber());
    }
}