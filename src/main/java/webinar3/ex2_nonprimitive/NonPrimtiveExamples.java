package webinar3.ex2_nonprimitive;

public class NonPrimtiveExamples {


    public static class NonPrimitiveExamples {
        public static void main(String[] args) {
            String text = "Uczymy się Javy!"; // Obiekt - - ciąg znaków (typ tekstowy)
            System.out.println(text.length());

            // deklaracja tablicy
            int[] table = new int[10]; // tablica danych, w której możemy przechować 10 elementów
            table[0] = 100; // dodanie elementu do tablicy

            // tworzymy zmienną własnego typu Student
            Student student = new Student(); // tzw instancja (reprezentant obiektu) klasy Student
            student.setName("Magda");

            Student student1 = new Student(); // tzw instancja (reprezentant obiektu) klasy Student
            student1.setName("Łukasz");

            System.out.println(student.getName());
            System.out.println(student1.getName());

        /*
            1. Nadaj obu studentom wiek i wyświetl w konsoli
            2*. Stwórz listę i dodaj do niej Studentów
         */
        }
    }
}
