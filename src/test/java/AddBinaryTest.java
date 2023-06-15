import easy.AddBinary;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AddBinaryTest {

    private AddBinary addBinary;

    @BeforeEach
    void prepare() {
        addBinary = new AddBinary();
    }

    @ParameterizedTest
    @CsvSource(value = {"11, 1, 100", "1010, 1011, 10101"})
    void checkMethod(String a, String b, String expected) {
        Assertions.assertThat(addBinary.addBinary(a, b)).isEqualTo(expected);
    }

}
