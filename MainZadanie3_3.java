package Zadania_1_Java.Zadania_1.src.main.java;
import java.util.Scanner;
public class MainZadanie3_3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = Scanner.nextInt();
        do {
            System.out.println("Hello, World");
            System.out.println("Podaj liczbę");
            liczba = Scanner.nextInt();
        } while (liczba>0);
        System.out.println("Koniec programu");
    }
}
