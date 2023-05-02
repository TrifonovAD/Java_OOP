package homework5.service;

import homework5.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void removeUser(User user);
    void updateUser(int index, User user);
    List<User> getUsersList();

}
