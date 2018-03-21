import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/21/2018.
 */
public class FirstTask {

/*
    Parašyti program?, kuri leist? vartotojui ?vesti norim? skai?i?
    ir po to parašyt? ar šis skai?ius yra lyginis, ar nelyginis.
    Užuomina panaudokite % operatoriu.
*/

    //ctrl+alt+l -> formatuoja koda
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();

        if (numb % 2 == 0) {
            System.out.println(numb + " yra lyginis");
        } else {
            System.out.println(numb + " nelyginis");
        }
    }
}
