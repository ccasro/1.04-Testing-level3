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
    void sub(){
        int result = calc.sub(10,100);
        assertThat(result).isEqualTo(-90);
    }

    @Test
    void div(){
        double result = calc.div(50.0,5.0);
        assertThat(result).isEqualTo(10.0);
    }

    @Test
    void mul(){
        int result = calc.mul(10,40);
        assertThat(result).isEqualTo(400);
    }
}
