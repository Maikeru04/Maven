import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions .*;
public class MathUtilsTest {

        // Testen einer einfachen Methode

        @Test
        void isPositive_ShouldReturnTrue_WhenNumberisPositive() {

            int number = 69;

            boolean result = MathUtils.isPositive(number);

            assertTrue(result);
        }

        @Test
        void isNegative_ShouldReturnFalse_WhenNumberisNegative() {
            int number = -69;

            boolean result = MathUtils.isPositive(number);

            assertFalse(result);
        }

        // Einfacher Multiplikationstest

        @Test
        void multiply_ShouldReturnPositiveProdukt() {
            int number1 = 7;
            int number2 = 7;

            int result = MathUtils.multiply(number1, number2);

            assertEquals(result, number1 * number2);
        }

        @Test
        void multiply_ShouldReturnNegativeProdukt() {
            int number1 = -7;
            int number2 = -7;

            int result = MathUtils.multiply(number1, number2);

            assertEquals(result, number1 * number2);
        }

        // Prüfung von Nullwerten

        @Test
        void getFirstLetter_ShouldBeNotNull() {
            String input = "This is a test";
            String result = MathUtils.getFirstLetter(input);
            assertNotNull(result);
        }

        @Test
        void getFirstLetter_ShouldBeNull() {
            String result = MathUtils.getFirstLetter(null);
            assertNull(result);
        }

        // Fehlerfälle testen

        @Test
        void divide_ShouldThrowException_WhenNumberisZero() {
            int number = 10;
            assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(number, 0));
        }

        // Mehrfachtests für eine Methode

        @Test
        void isPrime_ShouldReturnTrue_WhenNumberisPrime() {
            boolean result = MathUtils.isPrime(2147483647);
            assertTrue(result);
        }

        @Test
        void isPrime_ShouldReturnFalse_WhenNumberisNotPrime() {
            boolean result = MathUtils.isPrime(2147000001);
            assertFalse(result);
        }
}


