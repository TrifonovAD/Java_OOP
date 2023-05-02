// Реализовать систему работы банковского приложения.

// - Создать класс пользователь и соответсвующие классы
// - Реализовать операции зачисления средств пользователю на счет
//   и списания(У пользователя должно быть отдельное поле - его балланс)
// - Реализовать функции добавления и удаления пользователя

package homework5.view;
import homework5.model.User;
import homework5.controller.UserController;
import homework5.controller.UserBalanceController;

import java.util.List;

public class UserView {
    public static void main(String[] args) {



        UserController userController = new UserController();
        userController.addUser("Bill", 67);
        userController.addUser("Alexey", 43);
        userController.addUser("Anna", 30);
        userController.addUser("Roman", 28);
        userController.addUser("Sergey", 54);

        printUsersList(userController.getUsersList());
        System.out.println("==================================");

        UserBalanceController userBalanceController = new UserBalanceController();
        userBalanceController.payment(0, 1200000.00);
        userBalanceController.payment(1, 20000.00);
        userBalanceController.payment(2, 5000.00);
        userBalanceController.payment(3, 12500.00);
        userBalanceController.payment(4, 3700.00);
        printUsersList(userController.getUsersList());
        System.out.println("==================================");

        userBalanceController.withdrawal(0, 12000.00);
        userBalanceController.withdrawal(1, 120000.00);
        userBalanceController.withdrawal(2, 123.00);
        printUsersList(userController.getUsersList());

    }
    public static void printUsersList(List<User> usersList){
        for (User user : usersList) {
            System.out.println(user);
        }
    }
}
