package task2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List<Actor> actors = new ArrayList<>();
    private Queue<Actor> actorQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        actorQueue.add(actor);

    }

    @Override
    public void takeOrders() {
        Actor actor = actorQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setMakeOrder();
        }
    }

    @Override
    public void giveOrders() {
        Actor actor = actorQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setTakeOrder();
        }

    }

    @Override
    public void releaseFromQueue() {
        actorQueue.poll();
    }
}
