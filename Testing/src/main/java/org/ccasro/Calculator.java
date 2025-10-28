package org.ccasro;

public class Calculator {

    private double checkOverflow(double result, String operation){
        if(Double.isInfinite(result)) {
            throw new ArithmeticException("Overflow in " + operation);
        }
        return result;
    }

    public double div(double a, double b) {
        double result = a / b;
        if (b != 0.0) {
            return checkOverflow(result,"division");
        }
        return result;
    }

    public double add(double a, double b) {
        return checkOverflow(a+b,"addition");
    }

    public double sub(double a, double b) {
        return checkOverflow(a-b,"subtraction");
    }

    public double mul(double a, double b) {
        return checkOverflow(a * b,"multiplication");
    }

}
