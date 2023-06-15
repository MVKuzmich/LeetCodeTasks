package string;

import medium.StringToInteger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringToIntegerTest {

    private StringToInteger stringToInteger;

    @BeforeEach
    void prepare() {
        stringToInteger = new StringToInteger();
    }

    @ParameterizedTest
    @CsvSource(value = {"-5-, -5", "    0000000000000   , 0", "42, 42", "   -42, -42", "4193 with words, 4193", "words and 987, 0", "-91283472332, -2147483648", "+1, 1",
            "  0000000000012345678, 12345678", ".1, 0", "+-12, 0", "00000-42a1234, 0", "-000000000000001, -1"})
    void checkMethod(String given, int expected) {
        Assertions.assertThat(stringToInteger.myAtoi(given)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"0000000000012345678, 12345678", "1, 1", "42000, 42000"})
    void checkMethodTrim(String given, String expected) {
        Assertions.assertThat(stringToInteger.trimNullFromStart(given)).isEqualTo(expected);
    }
}
