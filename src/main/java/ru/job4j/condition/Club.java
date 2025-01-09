package ru.job4j.condition;

public class Club {

    public static void permission(boolean hasMoney, boolean beFriend) {
        /* Например, если value1 = true, то обычный оператор (|) прочитает три переменных,
        а укороченный (||) прочитает только первую переменную и сразу выдаст результат всего выражения */
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }

}
