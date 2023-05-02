package homework5.repository;

import homework5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    static private List<User> userList = new ArrayList<>();

    static public void addUser(User user) {
        userList.add(user);
    }

    static public void removeUser(User user) {
        System.out.println("remove user");
        userList.remove(user);
    }
    static public void updateUser(int index, User user) {
        userList.set(index, user);
    }

    public static List<User> getUserList() {
        return userList;
    }

    static public void payment(int index, Double amount) {
        userList.get(index).payment(amount);
    }

    static public Double withdrawal(int index, Double amount) {
        return userList.get(index).withdrawal(amount);
    }

    static public Double getBalance(int index) {
        return userList.get(index).getBalance();
    }
}
