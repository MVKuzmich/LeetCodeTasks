import easy.StringCommonDivisor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringCommonDivisorTest {

    private StringCommonDivisor commonDivisor;

    @BeforeEach
    void prepare() {
        commonDivisor = new StringCommonDivisor();
    }

    @ParameterizedTest
    @CsvSource(value = {"ABCABC, ABC, ABC", "ABABAB, ABAB, AB",  "LEET, CODE, ''", "ABCDEF, ABC, ''",
            "ABABABAB, ABAB, ABAB"})
    void checkMethod(String str1, String str2, String expected) {
        Assertions.assertThat(commonDivisor.gcdOfStrings(str1, str2)).isEqualTo(expected);
    }
}
