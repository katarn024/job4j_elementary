package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangAreaTest {

    @Test
    void whenP6K2ThenSquare2() {
        double expected = 2;
        int p = 6;
        int k = 2;
        double output = RectangArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP2K2ThenSquare2() {
        double expected = 1;
        int p = 4;
        int k = 1;
        double output = RectangArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP1K9ThenSquare0Dot02() {
        double expected = 0.02;
        int p = 1;
        int k = 9;
        double output = RectangArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}