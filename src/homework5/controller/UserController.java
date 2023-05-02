package homework5.controller;

import java.util.List;
import homework5.model.User;
import homework5.service.UserService;
import homework5.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void addUser(String name, int age) {
        userService.addUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUsersList() {
        return userService.getUsersList();
    }
}
