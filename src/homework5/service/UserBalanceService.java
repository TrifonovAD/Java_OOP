package homework5.service;

public interface UserBalanceService {
    void payment(int index, Double amount);
    Double withdrawal(int index, Double amount);
    Double getBalance(int index);
}