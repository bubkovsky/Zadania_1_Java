package Zadania_1_Java.Zadania_1.src.main.java;

public class MainZadanie10 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 2;
        int max = x;
        int min = x;

        if (max < y) {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        System.out.println("Max to: " + max);

        if (min > y) {
            min = y;
        }
        if (min > z) {
            min = z;
        }
        System.out.println("Min to: " + min);
    }
}
