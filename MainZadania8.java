package Zadania_1_Java.Zadania_1.src.main.java;

public class MainZadania8 {
    public static void main(String[] args) {
        int ocena_matematyka = 5;
        int ocena_chemia = 4;
        int ocena_j_polski = 1;
        int ocena_j_angielski = 2;
        int ocena_wos = 4;
        int ocena_informatyka = 6;
        double srednia_ogolna = (ocena_chemia + ocena_informatyka + ocena_j_angielski + ocena_j_polski + ocena_matematyka + ocena_wos) / 6;
        double srednia_scisla = (ocena_informatyka + ocena_chemia + ocena_matematyka) / 3;
        double srednia_hum = (ocena_j_angielski + ocena_j_polski + ocena_wos) / 3;
        if (ocena_chemia == 1 || ocena_informatyka == 1 || ocena_matematyka == 1) {
            System.out.println("Ocena z przedmiotów ścisłych jest niedostateczna");
        } else {
            System.out.println("średnia ze ścisłych to: " + srednia_scisla);
        }
        if (srednia_hum == 1 || (ocena_j_angielski == 1 || ocena_j_polski == 1 || ocena_wos == 1)) {
            System.out.println("Ocena z przedmiotów humanistyczych jest niedostateczna");
        } else {
            System.out.println("średnia z humana to: " + srednia_hum);
        }
        if (ocena_chemia == 1 || ocena_informatyka == 1 || ocena_matematyka == 1 || ocena_j_angielski == 1 || ocena_j_polski == 1 || ocena_wos == 1) {
            System.out.println("W sumie lipa ale podam Ci Twoją średnią: " + srednia_ogolna);
        } else {
            System.out.println("Twoja średnia ogólna to: " + srednia_ogolna);
        }

    }
}
