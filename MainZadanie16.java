package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.Random;
import java.util.Scanner;

public class MainZadanie16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random generator = new Random();
        int a=generator.nextInt();
        System.out.println(a);
        System.out.println("Czy liczba jest większa od 100?");
        String odpowiedz= scanner.nextLine();
       // do {

            if (a>100 && odpowiedz.equals("Tak")){
                System.out.println("Ta odpowiedź jest poprawna");
                int i=1;
            } else if (a>100 && odpowiedz.equals("Nie")){
                System.out.println("Ta odpowiedź nie jest poprawna");
                int i=2;
            } else if (a<100 && odpowiedz.equals("Nie")){
                System.out.println("Ta odpowiedź jest poprawna");
                int i=1;
            } else if (a<100 && odpowiedz.equals("Tak")){
                System.out.println("Ta odpowiedź nie jest poprawna");
                int i=2;
            } else {
                System.out.println("Wpisz Tak lub Nie");
                odpowiedz = scanner.nextLine();
            }
        }
        //    while (i==2);//warunek jest sły sprawdza dobrze
      //  System.out.printf("Skończyłem");
   // }
}
