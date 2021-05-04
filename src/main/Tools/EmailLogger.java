package main.Tools;

import main.Services.LoggerService;

public class EmailLogger implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("E mail'e loglandı");
    }
}
