package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] result = new int[100];
        for (int i = 0; i < coins.length; i++) {
            while (money - price >= coins[i]) {
                money -= coins[i];
                result[size] = coins[i];
                size += 1;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
