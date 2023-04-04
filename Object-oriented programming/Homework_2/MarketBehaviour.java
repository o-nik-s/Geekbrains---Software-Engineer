package geekbrains_course.Homework_2;

/** Интерфейс MarketBehaviour, который описывает логику магазина –
 * приход/уход покупателей, обновление состояния магазина
 */
public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);

    void update();
}
