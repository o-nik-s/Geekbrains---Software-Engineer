package geekbrains_course.Homework_2;

public class Human extends Buyer {
    public void setName(String name) { this.name = name; }
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
