/**
 * Created by andriusbaltrunas on 3/20/2018.
 */
public class MyFirstClass {

    //psvm sukurti greitai main metoda
    public static void main(String[] args) {

        //sout atspausdinimui
        System.out.println("Hello world");

        int a = 10;

        // sukurtas objektas
        MyFirstClass myFirstClass = new MyFirstClass();

        // ne statinis kviecimas statiniame per klases objekta
        myFirstClass.myNotStaticMethod(a);

        // tiesio per varda toje pacioje klaseje
        myStaticMethod();

        float b = 4.6f;
        double c = 2.4;

        boolean d = true;//false

        char e = 'A';

        String f = "This is String!!!";
    }

    private void myNotStaticMethod(int numb){
        System.out.println("Jusu skaicius " + numb);
    }


    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }
}

//git comandos
// git init
// git add .
// git commit -m "TEKSTAS"
// git remote add origin https://github.com/andriusbaltrunas/1-3_class_work_2018-03-20.git // tik viena karta reikia
// git push
