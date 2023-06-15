import easy.MoveZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MoveZeroTest {

    private MoveZero moveZero;

    @BeforeEach
    void prepare() {
        moveZero = new MoveZero();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] array, int[] expected) {
        moveZero.moveZeroes(array);
        Assertions.assertArrayEquals(expected, array);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0, 0, 0, 1}, new int[]{1, 0, 0, 0})
        );
    }


}
