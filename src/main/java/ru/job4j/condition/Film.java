package ru.job4j.condition;

public class Film {

    public static String permission(int age) {
        String label = "";
        if (age >= 18) {
            label = "Pleasem enjoy it.";
        } else {
            label = "You can't watch it.";
        }

        /* То же самое, но с использованием тернарного оператора */
        label = age >= 18 ? "Please, enjoy it." : "You can't watch it.";

        boolean can = age >= 18;
        label = can ? "Please, enjoy it." : "You can't watch it.";

        return label;
    }

    public static void main(String[] args) {
        String message = Film.permission(33);
        System.out.println(message);
    }
}
