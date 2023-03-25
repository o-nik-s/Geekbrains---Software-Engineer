package geekbrains_course.Seminar_1.Task_2;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов
 * и getProduct(String name)
 */
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
