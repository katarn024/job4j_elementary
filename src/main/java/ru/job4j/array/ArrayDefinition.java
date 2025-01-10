package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Количество ячеек массива ages: " + ages.length);
        System.out.println("Количество ячеек массива surnames: " + surnames.length);
        System.out.println("Количество ячеек массива prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Оля";
        names[1] = "Маша";
        names[2] = "Саша";
        names[3] = "Галя";
        for (String name : names) {
            System.out.println(name);
        }

    }
}
