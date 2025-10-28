package org.ccasro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void sum(){
        Calculator calc = new Calculator();
        int result = calc.add(5,10);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void sub(){
        Calculator calc = new Calculator();
        int result = calc.sub(10,100);
        assertThat(result).isEqualTo(-90);
    }

    @Test
    void div(){
        Calculator calc = new Calculator();
        double result = calc.div(50.0,5.0);
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    void mul(){
        Calculator calc = new Calculator();
        int result = calc.mul(10,40);
        assertThat(result).isEqualTo(400);
    }
}
