//Дан массив целых чисел. Верно ли, что массив является симметричным.

package geekbrains_course.Seminar_1;
public class Task5 {
    public static boolean symmetry(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 4, 2, 1};
        System.out.println(symmetry(arr));
    }

}
