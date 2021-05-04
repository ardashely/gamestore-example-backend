package main.Tools;

import main.Services.LoggerService;

public class DataBaseLogger implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("Data base'e loglandı | " + message );
    }
}
