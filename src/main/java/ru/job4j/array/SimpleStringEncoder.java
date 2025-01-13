package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol;
        int counter = 1;
        for (int i = 0; i <= input.length() - 1; i++) {
            symbol = input.charAt(i);
            if (input.length() - i > 1 && input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else if (counter >= 2) {
                result.append(symbol);
                result.append(counter);
                counter = 1;
            } else {
                result.append(symbol);
            }
        }
        return result.toString();
    }
}