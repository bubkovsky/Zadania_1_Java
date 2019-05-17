package Zadania_1_Java.Zadania_1.src.main.java;
import java.util.*;
import java.lang.*;

public class MainZadania5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kilogramach");
        int waga = scanner.nextInt();
        if (waga<1) {
            System.out.println("Niepoprawna wartość - poniżej 1, podaj jeszcze raz wagę w kilogramach");
            waga = scanner.nextInt();
        }
        System.out.println("Podaj swoj wzrost w centymetrach");
        int wzrost = scanner.nextInt();
        if (wzrost<1 || wzrost>250) {
            System.out.println("Niepoprawna wartość - poniżej 1 i powyzej 250, podaj jeszcze raz wagę w kilogramach");
            wzrost = scanner.nextInt();
        }
        System.out.println("Podaj swoj wiek w latach");
        int wiek = scanner.nextInt();
        if (wiek<1 || wiek>150) {
            System.out.println("Niepoprawna wartość - poniżej 1 i powyzej 150, podaj jeszcze raz wiek w latach");
            wiek = scanner.nextInt();
        }

        if (waga < 181 && (wzrost > 149 && wzrost < 221) && (wiek > 9 && wiek < 81)) {
            System.out.println("Możesz wejść na kolejkę");
        } else if (waga > 180) {
            System.out.println("Nie wejdziesz, jesteś zbyt ciężki");
        } else if (wzrost< 150){
            System.out.println("Nie wejdziesz, jesteś za mały");
        } else if (wzrost > 220){
        System.out.println("Nie wejdziesz, jesteś za wysoki");
        } else if (wiek < 10 || wiek > 80){
            System.out.println("Nie wejdziesz, Twój wiek jest nieodpowiedni");
        }

    }
}
