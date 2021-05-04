package main.Services;

import main.Entitys.Game;
import main.Entitys.User;

public interface UserGameService {
    void buy(Game game);
    void giveBack(Game game);
    void addCommet(Game game);
}