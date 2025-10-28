package org.ccasro;

public class Calculator {

    public double div(double a, double b) {
        double result = a / b;
        if(Double.isInfinite(result) && b != 0.0) {
            throw new ArithmeticException("Overflow in division");
        }
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        if(Double.isInfinite(result)) {
            throw new ArithmeticException("Overflow in addition");
        }
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        if(Double.isInfinite(result)) {
            throw new ArithmeticException("Overflow in substraction");
        }
        return result;
    }

    public double mul(double a, double b) {
        double result = a * b;
        if(Double.isInfinite(result)) {
            throw new ArithmeticException("Overflow in multiplication");
        }
        return result;
    }

}
