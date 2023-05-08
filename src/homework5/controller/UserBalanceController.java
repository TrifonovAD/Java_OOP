package homework5.controller;

import homework5.service.UserBalanceService;
import homework5.service.UserBalanceServiceImpl;

public class UserBalanceController {
    private UserBalanceService userBalanceService = new UserBalanceServiceImpl();

    public Double getBalance(int index) {
        return userBalanceService.getBalance(index);
    }

    public Double withdrawal(int index, Double amount) {
        return userBalanceService.withdrawal(index, amount);
    }

    public void payment(int index, Double amount) {
        userBalanceService.payment(index, amount);
    }
}