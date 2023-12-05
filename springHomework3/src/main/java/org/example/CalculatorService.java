package org.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
    public static Calculator validCalculator(Calculator calculator) {
        assert calculator != null;
        String a = String.valueOf(calculator.getOperandFirst());
        double b = calculator.getOperandSecond();
        String s = calculator.getOperator();

        if (a.equals(" ")) {
            calculator.setOperandFirst(Double.parseDouble(a));
        }
        if (Double.isNaN(b) && Double.isInfinite(b)) {
            calculator.setOperandSecond(b);
        }
        if (s != null) {
            calculator.setOperator(s);
        } else {
            calculator.getErrorMessage();
        }
        return calculator;
    }

    public static double calculator(Calculator calculator) {
        double a = calculator.getOperandFirst();
        double b = calculator.getOperandSecond();
        String symbol = calculator.getOperator();
        double result = 0;
        try {
            switch (symbol) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
            }
            calculator.setResult(result);
        } catch (Exception ex) {
            System.out.println(ex + "Error!!!");
        }
        return result;
    }
}
