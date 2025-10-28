package org.ccasro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    void sum(){
        double result = calc.add(5,10);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void sum_negative_num(){
        double result = calc.add(-5,-3);
        assertThat(result).isEqualTo(-8);
    }

    @Test
    void sum_with_decimals(){
        double result = calc.add(2.5,3.2);
        assertThat(result).isCloseTo(5.7, within(0.0001));
    }


    @Test
    void sub(){
        double result = calc.sub(10,100);
        assertThat(result).isEqualTo(-90);
    }


    @Test
    void sub_negative_num(){
        double result = calc.sub(-5,-3);
        assertThat(result).isEqualTo(-2);
    }

    @Test
    void sub_with_decimals(){
        double result = calc.sub(2.55,3.25);
        assertThat(result).isCloseTo(-0.7, within(0.0001));
    }

    @Test
    void div(){
        double result = calc.div(50.0,5.0);
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    void div_negative_num(){
        double result = calc.div(-50,-8);
        assertThat(result).isEqualTo(6.25);
    }

    @Test
    void div_with_decimals(){
        double result = calc.div(3.98,7.12);
        assertThat(result).isCloseTo(0.55, within(0.01));
    }

    @Test
    void mul(){
        double result = calc.mul(10,40);
        assertThat(result).isEqualTo(400);
    }

    @Test
    void mul_negative_num(){
        double result = calc.mul(-10,-30);
        assertThat(result).isEqualTo(300);
    }

    @Test
    void mul_with_decimals(){
        double result = calc.mul(2.55,3.90);
        assertThat(result).isCloseTo(9.945, within(0.0001));
    }
}
