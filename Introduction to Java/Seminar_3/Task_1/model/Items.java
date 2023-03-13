package geekbrains_course.Seminar_3.Task_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Integer volume;
}
