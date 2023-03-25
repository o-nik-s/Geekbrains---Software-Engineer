package geekbrains_course.Seminar_1.Task_3;

public class BottleOfWater extends Product {
    private String name;
    private int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BottleOfWater(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "ButtleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
