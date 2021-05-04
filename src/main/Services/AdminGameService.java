package main.Services;

import main.Entitys.Game;

public interface AdminGameService {
    void add(Game game);
    void delete(Game game);
    void updateName(Game game);
    void updateDescreption(Game game);
    void updateUnitPrice(Game game);
}
