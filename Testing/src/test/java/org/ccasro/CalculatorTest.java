package org.ccasro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    void shouldReturnCorrectSum_whenAddingPositiveNumbers(){
        double result = calc.add(5,10);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void shouldReturnCorrectSum_whenAddingNegativeNumbers(){
        double result = calc.add(-5,-3);
        assertThat(result).isEqualTo(-8);
    }

    @Test
    void shouldReturnCorrectSum_whenAddingDecimals(){
        double result = calc.add(2.5,3.2);
        assertThat(result).isCloseTo(5.7, within(0.0001));
    }

    @Test
    void shouldThrowException_whenAdditionOverflows() {
        assertThrows(ArithmeticException.class, () -> {
            calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    void shouldReturnCorrectDifference_whenSubtractingLargerFromSmaller(){
        double result = calc.sub(10,100);
        assertThat(result).isEqualTo(-90);
    }


    @Test
    void shouldReturnCorrectDifference_whenSubtractingNegativeNumbers(){
        double result = calc.sub(-5,-3);
        assertThat(result).isEqualTo(-2);
    }

    @Test
    void shouldReturnCorrectDifference_whenSubtractingDecimals(){
        double result = calc.sub(2.55,3.25);
        assertThat(result).isCloseTo(-0.7, within(0.0001));
    }

    @Test
    void shouldThrowException_whenSubtractionOverflows() {
        assertThrows(ArithmeticException.class, () -> {
            calc.sub(-Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    @Test
    void shouldReturnCorrectQuotient_whenDividingPositiveNumbers(){
        double result = calc.div(50.0,5.0);
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    void shouldReturnCorrectQuotient_whenDividingNegativeNumbers(){
        double result = calc.div(-50,-8);
        assertThat(result).isEqualTo(6.25);
    }

    @Test
    void shouldReturnCorrectQuotient_whenDividingDecimals(){
        double result = calc.div(3.98,7.12);
        assertThat(result).isCloseTo(0.55, within(0.01));
    }

    @Test
    void shouldReturnInfinityWhenDividingPositiveByZero(){
        assertThat(calc.div(10,0)).isEqualTo(Double.POSITIVE_INFINITY);
    }

    @Test
    void shouldReturnNegativeInfinityWhenDividingNegativeByZero(){
        assertThat(calc.div(-10,0)).isEqualTo(Double.NEGATIVE_INFINITY);
    }

    @Test
    void shouldReturnNaNWhenDividingZeroByZero() {
        assertThat(calc.div(0,0)).isNaN();
    }

    @Test
    void shouldThrowException_whenDivisionResultOverflows() {
        assertThrows(ArithmeticException.class, () -> {
            calc.div(Double.MAX_VALUE, 1e-308);
        });
    }

    @Test
    void shouldReturnCorrectProduct_whenMultiplyingPositiveNumbers(){
        double result = calc.mul(10,40);
        assertThat(result).isEqualTo(400);
    }

    @Test
    void shouldReturnCorrectProduct_whenMultiplyingNegativeNumbers(){
        double result = calc.mul(-10,-30);
        assertThat(result).isEqualTo(300);
    }

    @Test
    void shouldReturnCorrectProduct_whenMultiplyingDecimals(){
        double result = calc.mul(2.55,3.90);
        assertThat(result).isCloseTo(9.945, within(0.0001));
    }

    @Test
    void shouldThrowException_whenMultiplicationOverflows() {
        assertThrows(ArithmeticException.class, () -> {
            calc.mul(Double.MAX_VALUE, 2.0);
        });
    }
}
