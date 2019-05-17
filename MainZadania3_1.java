package Zadania_1_Java.Zadania_1.src.main.java;

public class MainZadania3_1 {
    public static void main(String[] args) {
//        Napisz aplikację która wypisuje:
//       liczby z zakresu 1 - 100 w nowych liniach
        //       liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
        //       liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
        //       liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
        //       liczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach
        //      liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
        //      liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
        //      litery od 'a' do 'z'
        //      litery od ‘A’ do ‘Z’
        //      litery od ‘A’ do ‘Z’, tylko co drugą
        //      litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
//‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania) np.

        //              Hello World
        //      Hello World
        //      Hello World

        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);

        }
        for (int i = 1000; i < 1021; i++) {
            System.out.printf(i + ", ");

        }
        for (int i = -30; i > -1001; i--) {
            if (i % 5 == 0) {
                System.out.println(String.valueOf(i));
            }
        }
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(String.valueOf(i));
            }
        }
        for (int i = 30; i < 301; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(String.valueOf(i));
            }
        }
        for (int i = -300; i < 301; i++) {
            if ((!(i % 2 == 0))) {
                System.out.printf(i + "; ");

            }
            System.out.println();
        }
        for (int i = -100; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + "; ");
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a'+i));
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('A'+i));
        }
        for (int i = 0; i < 38; i++) {
            System.out.println((char) ('A' + 2 * i));
        }
        for (int i = 0; i < 38; i++) {
           if ('b'+i % 2 ==0) {
               System.out.println((char) ('b' + i));
           }
        }
        for (int i = 1; i < 101; i++) {
                System.out.println(i +". Hello World!");
        }
        int w=0;
        while (w < 100) {
            System.out.println(w + 1);
            w++;
        }
        w=1000;
        while (w < 1021) {
            System.out.printf(w + ", ");
            w++;
        }
        System.out.println();
        w=-30;
        while (w > -1001) {
            if (w % 5 == 0) {
                System.out.println(String.valueOf(w));
            }
                w--;
            }

}
}
