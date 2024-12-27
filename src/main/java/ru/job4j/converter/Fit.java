package ru.job4j.converter;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double wonamWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 157;
        double man = Fit.manWeight(height);
        double woman = Fit.wonamWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}