package task5.controller;

import task5.model.User;
import task5.service.UserService;
import task5.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age){
        userService.saveUser(new User(name, age));
    }
}
