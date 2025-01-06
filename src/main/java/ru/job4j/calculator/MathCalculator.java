package ru.job4j.calculator;

public class MathCalculator {

    public static double sumAndMultyply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultyply(10, 20));
    }
}
