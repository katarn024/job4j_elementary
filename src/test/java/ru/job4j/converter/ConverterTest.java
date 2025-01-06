package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140rubleThen2Euro() {
        float input = 140;
        float excepted = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(excepted, withPrecision(value));
    }

    @Test
    void whenConvert180rubleThen3Dollar() {
        float input = 180;
        float excepted = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(excepted, withPrecision(value));
    }

    @Test
    void whenConvert0rubleThen0Dollar() {
        float input = 0;
        float excepted = 0;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(excepted, withPrecision(value));
    }
}