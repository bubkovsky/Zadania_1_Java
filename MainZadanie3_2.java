package Zadania_1_Java.Zadania_1.src.main.java;
import  java.util.Scanner;

public class MainZadanie3_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Podaj ile razy mam napisać Hello, World");
        int ilosc_powtorzen= Scanner.nextInt();
        for (int i = 0; i < ilosc_powtorzen; i++) {
            System.out.println("Hello, World");

        }
    }
}
