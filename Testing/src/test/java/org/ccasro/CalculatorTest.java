package org.ccasro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    void sum(){
        int result = calc.add(5,10);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void sum_negative_num(){
        int result = calc.add(-5,-3);
        assertThat(result).isEqualTo(-8);
    }

    @Test
    void sub(){
        int result = calc.sub(10,100);
        assertThat(result).isEqualTo(-90);
    }

    @Test
    void sub_negative_num(){
        int result = calc.sub(-5,-3);
        assertThat(result).isEqualTo(-2);
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
    void mul(){
        int result = calc.mul(10,40);
        assertThat(result).isEqualTo(400);
    }

    @Test
    void mul_negative_num(){
        int result = calc.mul(-10,-30);
        assertThat(result).isEqualTo(300);
    }
}
