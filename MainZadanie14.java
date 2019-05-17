package Zadania_1_Java.Zadania_1.src.main.java;

import java.util.Scanner;
import java.math.*;

public class MainZadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int n = scanner.nextInt();
        System.out.println("Wartość bezwzględna z podanej liczby to: " + Math.abs(n));
        System.out.println("Wartość przeciwna z podanej liczby to: " + n*(-1));
        System.out.println("Wartość odwrotną z podanej liczby to: " + (double)1/n);
    }
}
