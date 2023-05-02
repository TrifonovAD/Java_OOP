package homework5.model;

public class User {
    private String name;
    private int age;
    private Double balance;

    public User(String name, int age, Double balance) {
        this.name = name;
        this.age = age;
        this.balance = Double.valueOf(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

}
