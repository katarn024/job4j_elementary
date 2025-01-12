package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length; index++) {
            result &= word[word.length - index - 1] == postfix[postfix.length - index - 1];
        }
        return result;
    }
}