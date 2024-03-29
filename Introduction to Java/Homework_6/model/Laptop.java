package geekbrains_course.Homework_6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop {
    private Integer number;
    private String brand;
    private String model;
    private String manufactorCountry;
    private String colour;
    private double screenSize;
    private String CPU;
    private double RAM;
    private double HDD;
    private String OS;
    private double weight;
    private double price;
    private Integer count;

    public void sell(){
        count -= 1;
    }
    public void bringGoodsToWarehouse(Integer bringCount){
        count += bringCount;
    }
    public void returnGoods(Integer returnCount){
        count -= returnCount;
    }
    public void setNewPrice(double newPrice){
        price = newPrice;
    }

}
