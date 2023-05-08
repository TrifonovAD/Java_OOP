package view;

import task5.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your data");
        userController.saveUser(scanner.nextLine(),scanner.nextInt());
    }
}
