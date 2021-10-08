package webinar3.ex1_wrappers;

import java.util.ArrayList;

public class WrappersExamples {

    public static void main(String[] args) {
        int variable = 1;

        Integer a = 1; // sposób pierwszy - preferowany

        Integer b = new Integer(1); // sposób drugi

        System.out.println(a.doubleValue());

        System.out.println(a instanceof Object); // instanceof - zwraca true/false czy dana zmienna jest typu Object
        // błędny zapis, ponieważ variable jest typu int czyli typ prosty, a nie obiektowy
        // System.out.println(variable instanceof Object);

        Double c = 2.5;
        System.out.println(c.intValue());

        System.out.println(c instanceof Object);

        Float d = 3.2f;
        Character e = 'a';
        Character f = 97 - 21; // 76 - kod znaku L
        Boolean g = true;

        System.out.println(d.intValue());

        // tworzymy tzw listę, która przechowa wiele wartości typu Integer
        // Listy nie przyjmują typów prostych jako argumentów
//        ArrayLlist<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);

        /*
            Z wykorzystaniem metod dostępnych w wapperach wydrukuj:
            1. Zmienną 'a' jako liczbę zmiennoprzecinkową
            2. Zmienną 'c' jako liczbę całkowitą
         */
    }
}

