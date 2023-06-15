import medium.ZigzagConversion;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ZigzagConversionTest {

    private ZigzagConversion zigzagConversion;

    @BeforeEach
    void prepare() {
        zigzagConversion = new ZigzagConversion();
    }

    @ParameterizedTest
    @CsvSource(value = {"PAYPALISHIRING, 3, PAHNAPLSIIGYIR"})
    void checkMethod(String input, int rowNumber, String expected) {
        Assertions.assertThat(zigzagConversion.convert(input, rowNumber)).isEqualTo(expected);
    }
}
