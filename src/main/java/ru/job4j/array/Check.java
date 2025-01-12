package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            result = data[index - 1] == data[index];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
