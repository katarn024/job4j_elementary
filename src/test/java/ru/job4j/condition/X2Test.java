package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2Them40() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Them3() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Them2() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Them2() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0Them1() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* Ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        /* Вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }
}