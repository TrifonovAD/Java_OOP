package homework5.service;

import homework5.repository.UserRepo;

public class UserBalanceServiceImpl implements UserBalanceService{

    @Override
    public void payment(int index, Double amount) {
        UserRepo.payment(index, amount);

    }

    @Override
    public Double withdrawal(int index, Double amount) {
        return UserRepo.withdrawal(index, amount);
    }

    @Override
    public Double getBalance(int index) {
        return UserRepo.getBalance(index);
    }
}
