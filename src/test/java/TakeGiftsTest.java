import easy.TakeGifts;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TakeGiftsTest {

    private TakeGifts takeGifts;

    @BeforeEach
    void prepare() {
        takeGifts = new TakeGifts();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] array, int attempt, int expected) {
        Assertions.assertThat(takeGifts.pickGifts(array, attempt)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{25, 64, 9, 4, 100}, 4, 29),
                Arguments.of(new int[]{1,1,1,1}, 4, 4)
        );
    }
}
