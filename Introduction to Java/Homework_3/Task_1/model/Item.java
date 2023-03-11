package geekbrains_course.Homework_3.Task_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private Integer price;
    private Integer grade;
}
