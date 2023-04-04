package geekbrains_course.Seminar_2.Task_2;

import java.util.List;

/** Интерфейс MarketBehaviour, который описывает логику магазина –
 * приход/уход покупателей, обновление состояния магазина
 */
public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);

    void update();
}
