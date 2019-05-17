package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.Scanner;

public class MainZadanie3_4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("podaj początek zakresu");
        int poczatek_zakresu= Scanner.nextInt();
        System.out.println("podaj koniec zakresu");
        int koniec_zakresu= Scanner.nextInt();
        if (poczatek_zakresu>koniec_zakresu){
            System.out.println("początek nie może być większy niż koniec, podaj jeszcze raz wartości");
            System.out.println("podaj początek zakresu");
            poczatek_zakresu= Scanner.nextInt();
            System.out.println("podaj koniec zakresu");
            koniec_zakresu= Scanner.nextInt();
        }
        System.out.println("podaj dzielnik");
        int dzielnik = Scanner.nextInt();
        for (int i = poczatek_zakresu; i < koniec_zakresu+1; i++) {
            if (i % dzielnik ==0) {
                System.out.println(i);
            }
        }
        System.out.println("podaj początek zakresu");
        poczatek_zakresu= Scanner.nextInt();
        System.out.println("podaj koniec zakresu");
        koniec_zakresu= Scanner.nextInt();
        if (poczatek_zakresu>koniec_zakresu){
            System.out.println("początek nie może być większy niż koniec, podaj jeszcze raz wartości");
            System.out.println("podaj początek zakresu");
            poczatek_zakresu= Scanner.nextInt();
            System.out.println("podaj koniec zakresu");
            koniec_zakresu= Scanner.nextInt();
        }
        System.out.println("podaj liczbe dzielnikow");
        int liczbadzielnikow = Scanner.nextInt();
        for (int j = 0; j < liczbadzielnikow; j++) {
            System.out.println("Podaj kolejny dzielnik");
            int dzielniki = Scanner.nextInt();
            for (int z = poczatek_zakresu; z < koniec_zakresu+1; z++) {
                if (z % dzielniki ==0) {
                    System.out.println(z);
                }
            }
        }
    }
}
