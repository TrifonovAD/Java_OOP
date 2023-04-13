package task2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Alex");
        System.out.println(human.isMakeOrder());
        System.out.println(human.isTakeOrder());
        human.setMakeOrder();
        human.setTakeOrder();
        System.out.println(human.getName());
        System.out.println(human.isMakeOrder());
        System.out.println(human.isTakeOrder());
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
