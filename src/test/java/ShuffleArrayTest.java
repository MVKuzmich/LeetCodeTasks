import easy.ShuffleArray;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ShuffleArrayTest {

    private ShuffleArray shuffleArray;

    @BeforeEach
    void prepare() {
        shuffleArray = new ShuffleArray();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] given, int n, int[] expected) {
        Assertions.assertThat(shuffleArray.shuffle(given, n)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2, 3, 5, 4, 1, 7})
        );
    }
}
