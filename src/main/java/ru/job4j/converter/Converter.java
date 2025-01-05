package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
         return value / 35;
    }

    public static void main(String[] args) {
        float input = 140;
        float expectedEuro = 2;
        float expectedDollar = 4;
        float outputEuro = Converter.rubleToEuro(input);
        float outputDollar = Converter.rubleToDollar(input);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollar = expectedDollar == outputDollar;
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passedEuro);
        System.out.println("140 rubles are " + dollar + " dollar. Test result: " + passedDollar);
    }
}