package webinar3.ex3_operators_examples;

public class LogicalOperatorsExamples {

    public static void main(String[] args) {
        int i = 1, j = 2, k = 0;
        boolean b = true;

        // operator negacji
        System.out.println(!b);

        // operator && (and) - suma tzw i
        // zwraca true tylko jeśli wszystkie warunki zwrócą true
        System.out.println((i < j) && (i < k) && (j < 10));

        // operator || (or) - tzw lub
        // zwraca true jeśli przynajmniej jeden warunek zwróci true
        System.out.println((i < j) || (i < k));

    }
}

