package geekbrains_course.Homework_2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    /** Класс Market, который реализовывает два вышеуказанных интерфейса
     * и хранит в списке список людей в очереди в различных статусах
     */
    /** По итогу будем иметь два поля - один с очередью, другой со списком всех покупателей */
    List <Buyer> buyerList = new LinkedList<>( );
    Queue <Buyer> actorQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин.");
        buyerList.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        System.out.println(actor.getName() + " покинул магазин.");
        buyerList.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Buyer actor) {
        System.out.println(actor.getName() + " встал в очередь.");
        actorQueue.add(actor);
    }

    @Override
    public void takeOrder() {
        System.out.println(actorQueue.peek().getName() + " забрал заказ.");
        actorQueue.peek().isTakeOrder();
    }

    @Override
    public void giveOrder() {
        System.out.println(actorQueue.peek().getName() + " сделал заказ.");
        actorQueue.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorQueue.peek().getName() + " покинул очередь.");
        actorQueue.poll();
    }

    @Override
    public void printQueue() {
        System.out.println(actorQueue);
    }
}
