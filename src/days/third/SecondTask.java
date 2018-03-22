package days.third;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 3/22/2018.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.replaceAll(" ", "");
        if(isPolindrom(a)){
            System.out.println("Plindromas");
        }else {
            System.out.println("nu ne");
        }
    }

    private static boolean isPolindrom(String word){
        boolean result = true;
        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length() - 1- i)){
                result = false;
                break;
            }
        }
        return result;
    }
}
