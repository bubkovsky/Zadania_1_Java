package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainZadanie3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n");
        int N = scanner.nextInt();
        int A;
        for (int i = 0; i < N; i++) {
            System.out.println("Podaj a liczb");
            A = scanner.nextInt();
            int max = A;
            for (int h = 0; h < N; h++) {
                if (A > max)
                    max = A;
            }
            int min = A;
            for (int j = 0; j < N; i++) {
                if (A < min)
                    min = A;
            }
            int suma = max + min;
            double srednia = (max + min) / 2;
            System.out.println("suma: " + suma + ", srednia: " + srednia);
        }
    }
}
