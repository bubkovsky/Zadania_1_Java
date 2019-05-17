package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.Scanner;

public class MainZadanie3_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę n");
        int n=scanner.nextInt();
        for (int i = 1; Math.pow(2, i) < n; i++) {
                System.out.println((int) Math.pow(2, i));
        }
    }
}
