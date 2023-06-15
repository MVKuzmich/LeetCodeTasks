package string;

import easy.string.LastWordLength;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class LastWordLengthTest {

    private LastWordLength lastWordLength;

    @BeforeEach
    void prepare() {
        lastWordLength = new LastWordLength();
    }

    @ParameterizedTest
    @CsvSource(value = {"Hello World, 5", "   fly me   to   the moon  , 4", "luffy is still joyboy, 6", "a, 1"})
    void checkMethod(String given, int expected) {
        Assertions.assertThat(lastWordLength.lengthOfLastWord(given)).isEqualTo(expected);
    }
}
