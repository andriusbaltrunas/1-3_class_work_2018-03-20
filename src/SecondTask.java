import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/21/2018.
 */
public class SecondTask {
    private static final int MAX_NUMB = 100;
/*
    Paprašyti vartotojo nurodyti kiek skai?i? jis ketina ?vesti,
     tuomet duoti jam ?vesti tiek skai?i?, kiek jis pasirinko.
     Po ?vedimo atvaizduoti tik tuos skai?ius kurie buvo didesni nei 100.
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kiek skaiciu noresite uzpildyti");

        int kiek = scanner.nextInt();

        int[] mas = new int[kiek];

        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite " + i + " skaicius");
            mas[i] = scanner.nextInt();
        }

        printMas(mas);

    }

    private static void printMas(int[] skMas){
        for (Integer sk : skMas){
            if(sk >= MAX_NUMB){
                System.out.print(sk + " ");
            }
        }
    }
}
