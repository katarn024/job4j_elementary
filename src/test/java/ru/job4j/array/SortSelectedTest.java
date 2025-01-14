package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SortSelectedTest {
    @Test
    public void whenSort34125hen12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort165Then156() {
        int[] data = new int[] {1, 6, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort54321Then12345() {
        int[] data = new int[] {5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }
}