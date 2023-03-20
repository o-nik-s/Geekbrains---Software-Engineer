package geekbrains_course.Homework_6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Laptop {
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
}
