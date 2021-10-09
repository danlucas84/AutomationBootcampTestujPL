package webinar4;

public class CharExamples {

    public static void main(String[] args) {
        char small = 'a';
        char big = 'A';
        char num = '1';

        char znak = 65;
        char znakUnicode = '\u0041';

        System.out.println(znak);
        System.out.println(znakUnicode);

        System.out.println(Character.isLowerCase(small));
        System.out.println(Character.isUpperCase(small));
        System.out.println(Character.isLowerCase(big));
        System.out.println(Character.isUpperCase(big));

        Character small2 = 'a';
        System.out.println("\nPORÓWNANIA");
        System.out.println(small2.charValue() == small);
        System.out.println(small2.equals(small));
        System.out.println(Character.isLetter(small));
        System.out.println(Character.isLetter(num));
        System.out.println(Character.isDigit(num));
    }
}

