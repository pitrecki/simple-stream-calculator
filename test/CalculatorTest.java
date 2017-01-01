import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-01-01.
 */
class CalculatorTest
{
    private Calculator calculator;
    private double[] values;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
        this.values = new double[]{5.0, 10.0, -5.0, 7.0};
    }

    @Test
    @DisplayName("Testing the correct calculation of sum")
    void testAddition() {
        double actual = calculator.add(values);
        double expected = 17;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing the correct calculation of difference")
    void testSubstraction() {
        double actual = calculator.substract(values);
        double expected = -7;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing the correct calculation of product")
    void testMultiplication() {
        double actual = calculator.multiply(values);
        double expected = -1750;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing the correct calculation of quotient")
    void testDivision() {
        double actual = calculator.divide(values);
        double expected = (5d / 10d / -5d / 7d);

        assertEquals(expected, actual);
    }
}