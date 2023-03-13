package geekbrains_course.Homework_3.Task_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer grade;
}
