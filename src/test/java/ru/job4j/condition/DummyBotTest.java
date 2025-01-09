package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenHiBotThenHiSmartAss() {
        String input = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String output = DummyBot.answer(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenByeThenSeeYouLater() {
        String input = "Bye.";
        String expected = "See you later.";
        String output = DummyBot.answer(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenUnknowQuestionThenIDontKnow() {
        String input = "What is your name?";
        String expected = "I don't know. Please, ask another question.";
        String output = DummyBot.answer(input);
        assertThat(output).isEqualTo(expected);
    }
}