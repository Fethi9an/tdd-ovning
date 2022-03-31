import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    @Test
    public void Multiplier() {
        assertEquals(8, calculator.multiplyNumbers(2, 4));

    }

    @Test
    public void tryAPlusB() {
        assertEquals(4, calculator.add(2, 2));
        assertNotEquals(3, calculator.add(4, 1));
    }

    @Test
    public void tryAMinusB() {

        assertEquals(3, calculator.sub(4, 1));
    }

    @Test
    @DisplayName("DisplayName")
    public void TryADividedByB() {
        assertEquals(4, Calculator.divided(8, 2));
        assertNotEquals(4, Calculator.divided(2, 3));
    }

    @Test
    public void TryTwoPlusTwoPlusThreeEqualSeven() {
        assertEquals(7, calculator.plus(2, 2, 3));
    }

    @Test
    public void IsTelephoneNumberValid() {
        Assertions.assertTrue(calculator.isTrue("0700448815"));
    }

    @Test
    public void ShouldNotValidateTelephoneNumber() {
        Assertions.assertFalse(calculator.isTrue("040448815"));
    }

    @Test
    public void ValidateEmail() {
        Assertions.assertTrue(calculator.email("martinfethi97@hotmail.com"));
    }

    @Test
    public void ShouldNotValidateEmail() {
        Assertions.assertFalse(calculator.email("martinfethi@hotmail.coms"));
    }
}



