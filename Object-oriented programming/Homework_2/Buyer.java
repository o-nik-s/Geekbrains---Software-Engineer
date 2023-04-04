package geekbrains_course.Homework_2;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();
}
