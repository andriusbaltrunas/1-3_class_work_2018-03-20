import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/21/2018.
 */
public class ThirdTask {
    public static void main(String[] args) {
        int [][] matrix= {{12, 23, 24}, {123,2,2,4}};

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                int a = matrix[i][j];
            }
        }



        Scanner scanner = new Scanner(System.in);
        int sk = 0;
        int kiek = 0;
        int[] mas = {};

        do {
            System.out.println("Veskite tol kol bus ivestas ne 0");
            try {
                sk = scanner.nextInt();
                if (mas.length <= kiek) {
                    mas = Arrays.copyOf(mas, mas.length + 1);
                }
                mas[kiek++] = sk;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
                scanner.nextLine();
            }
        } while (sk != 0);

        System.out.println("Suma yra :" + masSum(mas));

    }

    private static int masSum(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum += m;
        }
        return sum;
    }
}
