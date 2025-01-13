package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (target == array[i] + array[j]) {
                return new int[] {i, j};
            } else if (target < array[i] + array[j] || j == array.length - 1) {
                i++;
                j = i + 1;
            }
            j++;
        }
        return new int[0];
    }
}
