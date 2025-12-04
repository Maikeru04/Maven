public class TDD_Exercise {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        if (input.toLowerCase().equals(new StringBuilder(input.toLowerCase()).reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static int countVowels(String input) {
        int amountOfVowels = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                amountOfVowels++;
            }
        }
        return amountOfVowels;
    }
}
