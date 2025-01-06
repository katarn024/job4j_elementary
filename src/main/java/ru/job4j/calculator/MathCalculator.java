package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultyply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumBaseMathOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultyply равен: " + sumAndMultyply(10, 20));
        System.out.println("Результат расчета differenceAndDivision равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета суммы основных операций равен: " + sumBaseMathOperation(10, 20));
    }
}
