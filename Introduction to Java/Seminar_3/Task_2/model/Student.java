package geekbrains_course.Seminar_3.Task_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String surname;
    private Integer number_group;
    private Integer grant;
    private List<Integer> grades;
}