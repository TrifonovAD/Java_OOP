package lection3_2;


public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("молоко"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
