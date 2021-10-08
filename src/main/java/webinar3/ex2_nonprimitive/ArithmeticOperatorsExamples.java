package webinar3.ex2_nonprimitive;

public class ArithmeticOperatorsExamples {

    public static void main(String[] args) {
        int i = 4, j = 11, l = 0; // 11 / 4 = 2 * 4 + 3 czyli 2 i reszty 3
        int k = 0;

        k = i + j;
        System.out.println("Suma: " + k + " :)"); // operator konkatenacji + służy do łączenia ciągów znaków

        k = j - i;
        System.out.println("Różnica: " + k);

        k = i * j;
        System.out.println("Iloczyn: " + k);

        k = j / i;
        System.out.println("Iloraz: " + k);

        k = j % i;
        System.out.println("Reszta z dzielenia : " + k);

        int x = 0;
        // Krok 1: y = x
        // Krok 2: x = x + 1
        int y = x++; // postinkrementacja
        System.out.println("y: " + y);
        System.out.println("x: " + x);

        System.out.println("-----------");

        x = 0;
        y = 0;
        // Krok 1: x = x + 1
        // Krok 2: y = x
        y = ++x; // preinkrementacja

        System.out.println("y: " + y);
        System.out.println("x: " + x);

        System.out.println("--------operacje zwiazane z operatorem minus ponizej ------------------------------------------------");

        /*
        -- postdekrementacja / predekrementacja
        Przćwiczcie z -- na bazie ++
         */

        double a = 0;
        // Krok 1: a = b
        // Krok 2: a = a + 1
        double b = a--; // postinkrementacja
        System.out.println("b: " + b);
        System.out.println("a: " + a);

        System.out.println("----------------");

        a = 0;
        b = 0;
        // Krok 1: x = x + 1
        // Krok 2: y = x
        b = --a; // preinkrementacja

        System.out.println("b: " + b);
        System.out.println("a: " + a);

        System.out.println("-------koniec programu-------------");

    }

}
