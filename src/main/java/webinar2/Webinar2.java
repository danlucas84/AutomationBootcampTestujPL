package webinar2;

//     poćwiczyć tworzenie zmiennych różnych typów
//    dodać metodę  zwracającą "odejmującą"  i użyć jej w programie

public class Webinar2 {

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Uczymy się Javy!"); // wyświetlanie komunikatu w konsoli

            // deklaracja zmiennej
            int numberOfPlayers;

            // inicjalizacja, czyli pierwsze przypisanie wartości do zmiennej
            numberOfPlayers = 10;

            // Deklaracja z inicjalizacją
            int age = 18;

            // tworznie kilku zmiennych od razu
            int x = 10, y = 20;

            // przechowywanie wartości true/false
            boolean isAdult = true;

            // przechowanie pojedynczego znaku
            char sign = '&';

            // przechowanie liczby zmiennoprzecinkowej
            float a = 345.987f; // 6-7 miejsc po przecinku
            double b = 43434.75485734987; // 15-16 miejsc po przecinku

            // jeśli wyświetlam wartość zmiennej to bez cudzysłowów
            System.out.println(numberOfPlayers);

            displaySum();
            displaySumWithArguments(40, 35);
            displaySumWithArguments(100, 32);
            displaySumWithArguments(0, 500);
            displaySubstract();
            displaySubstractWithArguments(5,3);

            int resultSum = sum(15, 25); // zwrócone zostało 40
            System.out.println(resultSum);

            System.out.println(sum(100, 50));

            int resultSubstract = substract(30, 45);
            System.out.println(resultSubstract);

            System.out.println(substract(100, 20));

        }


        // metoda nie zwracająca wartości - void
        // nie mogę użyć return
        public static void displaySum() {
            int numberOne = 10;
            int numberTwo = 15;
            System.out.println(numberOne + numberTwo);
        }

        public static void displaySubstract() {
            int numberOne = 5;
            int numberTwo = 3;
            System.out.println(numberOne - numberTwo);
        }

        // metoda z argumentami (parametry) - każdy oddzielamy przecinkiem - każdy argument automatycznie tworzy zmienną
        public static void displaySumWithArguments(int numberOne, int numberTwo) {
            System.out.println(numberOne + numberTwo);
        }

        private static void displaySubstractWithArguments(int numberOne, int numberTwo) {
            System.out.println(numberOne - numberTwo);
        }


        // metoda zwraca wartość - trzeba podać typ jaki jest zwracany do miejsca, gdzie wywołano (uruchomiono) metodę
        // metoda zwracająca wartość musi mieć return
        public static int sum(int numberOne, int numberTwo) {
            int resultSum = numberOne + numberTwo;
            return resultSum;
        }

        public static int substract(int numberOne, int numberTwo) {

            int resultSubstract = numberOne - numberTwo;

            return resultSubstract;
        }

    }

}
