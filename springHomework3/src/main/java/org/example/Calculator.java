package org.example;

import java.util.Objects;

public class Calculator {
    private double operandFirst;
    private double operandSecond;
    private String operator;
    private double result;
    private String errorMessage = "Error!";

    public Calculator() {
    }

    public double getOperandFirst() {
        return operandFirst;
    }

    public void setOperandFirst(double operandFirst) {
        this.operandFirst = operandFirst;
    }

    public double getOperandSecond() {
        return operandSecond;
    }

    public void setOperandSecond(double operandSecond) {
        this.operandSecond = operandSecond;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "equals='" + result + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return Double.compare(that.operandFirst, operandFirst) == 0 && Double.compare(that.operandSecond, operandSecond) == 0 && Double.compare(that.result, result) == 0 && Objects.equals(operator, that.operator) && Objects.equals(errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operandFirst, operandSecond, operator, result, errorMessage);
    }
}
