package geekbrains_course.Seminar_1.Task_3;

public abstract class Product {
    protected static String name;
    protected static int cost;

//    В абстрактном классе конструкторы прописываются, но мы не можем создать экзмепляры абстрактного класса
    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    protected Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String   toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
