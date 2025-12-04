import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions .*;

public class TDD_ExerciseTest {

    // Aufgabe 4 – reverseString()

    @Test
    void reverseString_ShouldReturnInputReversed() {
        String input = "Test Input";
        String expectedOutput = "tupnI tseT";
        String actualOutput = TDD_Exercise.reverseString(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void isPalindrome_ShouldReturnTrue() {
        String input = "Otto";
        boolean result = TDD_Exercise.isPalindrome(input);
        assertTrue(result);
    }

    @Test
    void isPalindrome_ShouldReturnFalse() {
        String input = "Java";
        boolean result = TDD_Exercise.isPalindrome(input);
        assertFalse(result);
    }

    @Test
    void countVowels_ShouldReturnVowelsCount() {
        String input = "Antidisestablishmentarianism";
        int result = TDD_Exercise.countVowels(input);
        assertEquals(11, result);
    }
}
