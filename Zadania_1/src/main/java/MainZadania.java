public class MainZadania {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("Zadanie 1");
        System.out.println("Hello, World");
        // Koniec zadania 1

        //Zadanie 2
        int x=3;
        int y=5;
        int wynik=x*y;
        System.out.println("Wynik mnożenia "+ x + " * " + y + " = " + wynik);

        // Zadanie 3
        //a. false == false
        //b. false != true
        //c. !true
        //d. 2 > 4
        //e. 3 < 5
        //f. 3 == 3 && 3 == 4
        //g. 3 != 5 || 3 == 5
        //h. (2+4) > (1+3)
        //i. “cos”.equals(“cos”);
        //j. “cos” == “cos”;

        System.out.print("a. ");
        System.out.println(false == false); // Zapis w 2 liniach przez problem ze stringiem dodawanie przed porónaniem powoduje zgryz
        System.out.print("b. ");
        System.out.println(false != true);
        System.out.print("c. ");
        System.out.println(!true);
        System.out.print("d. ");
        System.out.println(2 > 4);
        System.out.print("e. ");
        System.out.println(3 < 5);
        System.out.print("f. ");
        System.out.println(3 == 3 && 3 == 4);
        System.out.print("g. ");
        System.out.println(3 != 5 || 3 == 5);
        System.out.print("h. ");
        System.out.println((2+4) > (1+3));
        System.out.print("i. ");
        System.out.println("cos".equals("cos"));
        System.out.print("j. ");
        System.out.println("cos" == "cos");
    }
}
