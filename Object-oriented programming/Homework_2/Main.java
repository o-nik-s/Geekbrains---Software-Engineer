package geekbrains_course.Homework_2;

public class Main {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.setName("Александр");

        Market market = new Market();
        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}
