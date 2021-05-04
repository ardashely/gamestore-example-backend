package main.Services;

import main.Entitys.User;

public interface UserService {
    void register(User user);
    void delete(User user);
    void updateFirstName(User user);
    void updateLastName(User user);
    void updateBirthDay(User user);
    void updateIdentificationNumber(User user);
}