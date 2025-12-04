public class MathUtils {

    // Testen einer einfachen Methode

    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Einfacher Multiplikationstest

    public static int multiply(int a, int b) {
        return a * b;
    }

    // Prüfung von Nullwerten

    public static String getFirstLetter(String text) {

        if(text != null) {
            text.substring(0, 1);
        }

        return text;
    }

    // Fehlerfälle testen

    public static int divide(int a, int b) {

        if(b != 0) {
            return a / b;
        } throw new IllegalArgumentException();

    }

    // Mehrfachtests für eine Methode

    public static boolean isPrime(int number) {
        if(number > 1 && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            return  true;
        } else {
            return false;
        }
    }


}
