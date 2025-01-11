package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void when123Then321() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when1234Then4321() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}