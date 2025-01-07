package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return 0.713 * height - 58;
    }

    public static double womanWeight(short height) {
        return 0.713 * height - 49;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 170 is " + woman);
    }

}