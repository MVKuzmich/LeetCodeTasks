package string;

import easy.string.ValidParentheses;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void prepare() {
        validParentheses = new ValidParentheses();
    }

    @ParameterizedTest
    @ValueSource(strings = {"()", "()[]{}", "{[]}"})
    void checkMethodCaseTrue(String input) {
        Assertions.assertThat(validParentheses.isValid(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"(]"})
    void checkMethodCaseFalse(String input) {
        Assertions.assertThat(validParentheses.isValid(input)).isFalse();
    }
}
