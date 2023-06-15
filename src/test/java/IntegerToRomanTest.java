import medium.IntegerToRoman;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    @BeforeEach
    void prepare() {
        integerToRoman = new IntegerToRoman();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int number, String expected) {

        Assertions.assertThat(integerToRoman.intToRoman(number)).isEqualTo(expected);

    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(1524, "MDXXIV"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV")
        );
    }

    @ParameterizedTest
    @CsvSource(value = {"400, CD","3, III", "8, VIII", "1, I", "50, L", "700, DCC"})
    void checkFindRomanMethod(int number, String expected) {
        Assertions.assertThat(integerToRoman.findRoman(number)).isEqualTo(expected);
    }
}
