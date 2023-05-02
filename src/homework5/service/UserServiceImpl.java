package homework5.service;

import homework5.model.User;
import homework5.repository.UserRepo;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
        if (user != null) {
            UserRepo.addUser(user);
        } else {
            System.out.println("User is null!");
        }

    }

    @Override
    public void removeUser(User user) {
        if (user != null) {
            UserRepo.removeUser(user);
        } else {
            System.out.println("User null!");
        }

    }

    @Override
    public void updateUser(int index, User user) {
        if (user != null) {
            UserRepo.updateUser(index, user);
        } else {
            System.out.println("User null!");
        }
    }

    @Override
    public List<User> getUsersList() {
        return UserRepo.getUserList();
    }
}
