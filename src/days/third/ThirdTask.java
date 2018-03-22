package days.third;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/22/2018.
 */
public class ThirdTask {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String a = "as ir tu";

        menu();

        String selection = scanner.nextLine();

        switch (selection){
            case "a":
                //cia staciojo trikampio plotas
                staciojoTrikampioPlotas();
                break;
            case "b":
                //staciakampio plotas
                break;
            case "c":
                //kvadrato plotaas
                break;
            case "d":
                //apskritimo plotas
                break;
            default:
                System.out.println("Nieko cia nera");
                break;

        }
    }

    private static void menu(){
        System.out.println("Pasirinkite ka norite daryt.\n" +
                "a. statciojo trikampio plotas\nb.staciakampio plotas\n" +
                "c.Kvadrato plotas\nd.Apskritimo plotas");
    }

    private static void staciojoTrikampioPlotas(){
        System.out.println("Iveskite a statini");
        double a = getCorrectNumber();
        System.out.println("Iveskit b statini");
        double b = getCorrectNumber();

        double p = (a * b) / 2;

        System.out.println("statiojo trikampio plotas yra :" + p);
    }

    private static double getCorrectNumber(){
        double result = 0.0;
        while (true) {
            try {
                result = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("blogas skaicius bandykite ivesti dar karta!");
                scanner.nextLine();
            }
        }
        return result;
    }

    private static void splitString(){
        String test = "as ir tu mes kartu";
        String[] items = test.split(" ");
        for(String t : items){
            System.out.println(t);
        }
    }
}
