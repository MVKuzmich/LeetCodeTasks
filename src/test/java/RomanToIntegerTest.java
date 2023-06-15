import easy.RomanToInteger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    void prepare() {
        romanToInteger = new RomanToInteger();
    }

    @ParameterizedTest
    @CsvSource(value = {"MCMXCIV, 1994", "LVIII, 58"})
    void checkMethod(String given, int expected) {
        Assertions.assertThat(romanToInteger.romanToInt(given)).isEqualTo(expected);
    }
}
