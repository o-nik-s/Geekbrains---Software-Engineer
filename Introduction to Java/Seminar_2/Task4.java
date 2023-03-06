package geekbrains_course.Seminar_2;

import geekbrains_course.Seminar_2.model.Vector;
public class Task4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 3.0, 9.0);
        Vector vector2 = new Vector(3.0, 3.0, 3.0);
        System.out.println("lenght= " + vector1.length());
        System.out.println("scal= " + vector1.vectorScal(vector2));
        System.out.println("vectorPr= " + vector1.vectorProduct(vector2));
        System.out.println("cos= " + vector1.vectorCos(vector2));
        System.out.println("sum= " + vector1.vectorSum(vector2));
        System.out.println("diff= " + vector1.vectorDiff(vector2));
    }
}
