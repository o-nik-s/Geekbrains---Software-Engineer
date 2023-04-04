package geekbrains_course.Seminar_2.Task_1;

public class Human extends Buyer {
    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() { // Устанавливаем значение того, что сделали заказ
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
