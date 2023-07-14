import medium.FirstAntFall;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FirstAntFallTest {

    private FirstAntFall firstAntFall;

    @BeforeEach
    void init() {
        firstAntFall = new FirstAntFall();
    }

    @ParameterizedTest
    @CsvSource(value = {"4, 1, 3, 2",
            "4, 4, 1, 3",
            "4, 4, 3, 1",
            "3, 3, 1, 2"})
    void testMethod(int length, int left, int right, int expected) {
        Assertions.assertThat(firstAntFall.getRoundCountFirstAntFall(length, left, right)).isEqualTo(expected);
    }
}
