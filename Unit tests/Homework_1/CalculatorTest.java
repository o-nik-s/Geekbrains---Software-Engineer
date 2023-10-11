package Homework_1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    public void testCalculateDiscount() {
        Calculator calculator = new Calculator();

        double result = calculator.calculateDiscount(100, 10);
        assertThat(result).isEqualTo(90);

        result = calculator.calculateDiscount(50, 5);
        assertThat(result).isEqualTo(47.5);

        assertEquals(82, calculator.calculateDiscount(100, 20), "Ошибка в вычислениях");
        assertTrue(calculator.calculateDiscount(50, 10) == 45, "Ошибка в вычислениях");

    }


    @Test
    public void testCalculateDiscountWithInvalidArguments() {
        Calculator calculator = new Calculator();

        calculator.calculateDiscount(-100, 10);
        calculator.calculateDiscount(1000, 120);
        calculator.calculateDiscount(500, -30);
        calculator.calculateDiscount(250, 40);
    }

}