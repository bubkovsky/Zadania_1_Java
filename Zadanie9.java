package Zadania_1_Java.Zadania_1.src.main.java;
import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę stopni Celsjusza, a program poda ile to stopni Fahrenheita");

        Scanner scanner = new Scanner(System.in);
        double Celsjusz; //double w razie gdyby ktoś chciał dać ułamek
        Celsjusz = scanner.nextDouble();
        double Fahrenheit = 1.8 * Celsjusz + 32.0;
        System.out.println(Celsjusz + " stopni Celsjusza to: " + Fahrenheit + " stopni Fahrenheita");
    }
}