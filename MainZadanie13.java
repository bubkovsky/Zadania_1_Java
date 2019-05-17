package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.Random;
import java.util.Scanner;

public class MainZadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random losuj = new Random();
        System.out.println("a. Wprowadź ile liczba całkowitych mam wygenerować");
        int N = scanner.nextInt();
        System.out.println("Wprowadź liczbę początkową przedziału losowania");
        int poczatek=scanner.nextInt();
        System.out.println("Wprowadź liczbę końcową przedziału losowania");
        int koniec=scanner.nextInt();
        //i<N bo i zaczyna od 0 więc można powiedzieć że mamy N+1 liczb więc nie potrzeba znaku równości
        for (int i = 0; i < N; i++) {
            int liczba = losuj.nextInt(koniec+1-poczatek)+poczatek; //musiałem dodać 1 nie do końca wiem czemu
            System.out.println(liczba);
        }
        System.out.println("a. Wprowadź ile liczba zmiennoprzecinkowych mam wygenerować");
        N = scanner.nextInt();
        System.out.println("Wprowadź liczbę początkową przedziału losowania");
        poczatek=scanner.nextInt();
        System.out.println("Wprowadź liczbę końcową przedziału losowania");
        koniec=scanner.nextInt();
        //i<N bo i zaczyna od 0 więc można powiedzieć że mamy N+1 liczb więc nie potrzeba znaku równości
        for (int i = 0; i < N; i++) {
            double liczba_double = losuj.nextDouble()*(koniec-poczatek) +poczatek;
            System.out.println(liczba_double);
        }
        System.out.println("a. Wprowadź ile wartości boolean mam wygenerować");
        N = scanner.nextInt();
        //i<N bo i zaczyna od 0 więc można powiedzieć że mamy N+1 liczb więc nie potrzeba znaku równości
        for (int i = 0; i < N; i++) {
            boolean liczba_boolean = losuj.nextBoolean();
            System.out.println(liczba_boolean);
        }
    }

    //dopisać kod z math.random zamiast klasy random
}
