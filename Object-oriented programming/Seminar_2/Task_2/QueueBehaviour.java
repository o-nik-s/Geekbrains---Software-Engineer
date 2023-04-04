package geekbrains_course.Seminar_2.Task_2;

/**
 * Интерфейс QueueBehaviour, который описывает логику очереди
 * – помещение в/освобождение из очереди, принятие/отдача заказа
 */
public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void giveOrder();
    void takeOrder();
    void releaseFromQueue();
    void printQueue();

}
