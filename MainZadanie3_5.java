package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.Scanner;

public class MainZadanie3_5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("podaj liczbe A");
        int A= Scanner.nextInt();
        System.out.println("podaj liczbę B");
        int B= Scanner.nextInt();
        if (A>B) {
            System.out.println("A nie może być większe niż B, podaj jeszcze raz wartości");
            System.out.println("podaj jeszcze raz liczbę A");
            A = Scanner.nextInt();
            System.out.println("podaj jeszcze raz liczbę B");
            B = Scanner.nextInt();
        }
        int i=0;
        do {
            System.out.println(A+i);
            i++;
        } while (A+i <B+1);
    }
}
