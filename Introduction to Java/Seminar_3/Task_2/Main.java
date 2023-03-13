// 2. Дан массив объектов: фамилия студента, номер группы, размер стипендии,
// баллы по 3 предметам. Определить стипендии студентов, фамилии которых
// заканчиваются на «ова», при четной сумме баллов.

package geekbrains_course.Seminar_3.Task_2;

import geekbrains_course.Seminar_3.Task_2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final String partSurname = "ова";
        final Integer divider = 2;

        List<Student> studentList = defineStudentList();

        List<Student> choiceStudentList = new ArrayList<>();
        for (Student student :
                studentList) {
            if (isCorrectStudent(student, partSurname, divider)) {
                choiceStudentList.add(student);
            }
        }
        for (Student student :
                choiceStudentList) {
            System.out.println(student.getSurname() + ": " + student.getGrades());
        }
    }
    public static boolean isCorrectStudent(Student student, String partSurname, Integer divider) {
        String surname = student.getSurname();
        Integer sumGrages = 0;
        for (Integer grade :
                student.getGrades()) {
            sumGrages += grade;
        }
        if (surname.substring(surname.length()-partSurname.length(), surname.length()).equals(partSurname) &&
                sumGrages%divider==0) {
            return true;
        }
        return false;
    }
    public static List<Student> defineStudentList() {

        List<Student> studentList = new ArrayList<>();
        Student st1 = new Student("Иванов", 2, 15000, List.of(3,5,4,5));
        Student st2 = new Student("Петров", 1, 17000, List.of(3,5,5,4));
        Student st3 = new Student("Сидоров", 3, 27000, List.of(4,5,5,5));
        Student st4 = new Student("Иванова", 2, 25000, List.of(4,5,4,3));
        Student st5 = new Student("Петрова", 3, 35000, List.of(3,5,4,5));
        Student st6 = new Student("Сидорова", 2, 25000, List.of(4,5,5,4));
        Student st7 = new Student("Лавреньтева", 1, 35000, List.of(3,5,3,5));
        Student st8 = new Student("Кузнецов", 1, 10000, List.of(5,5,4,5));
        Student st9 = new Student("Баранникова", 2, 12000, List.of(5,3,4,5));
        Student st10 = new Student("Огуречников", 3, 13000, List.of(4,4,4,4));

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);
        studentList.add(st7);
        studentList.add(st8);
        studentList.add(st9);
        studentList.add(st10);

        return studentList;
    }

}