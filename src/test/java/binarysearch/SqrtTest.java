package binarysearch;

import easy.binarysearch.Sqrt;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtTest {

    private Sqrt sqrt;

    @BeforeEach
    void prepare() {
        sqrt = new Sqrt();
    }

    @ParameterizedTest
    @CsvSource(value = {"2147395599, 46339", "0, 0", "1, 1", "2, 1", "3, 1", "8, 2", "4, 2", "9, 3", "6, 2"})
    void checkMethod(int given, int result) {
        Assertions.assertThat(sqrt.mySqrt(given)).isEqualTo(result);
    }
}
