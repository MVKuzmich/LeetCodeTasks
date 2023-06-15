import medium.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RotateArrayTest {

    private RotateArray rotateArray;

    @BeforeEach
    void prepare() {
        rotateArray = new RotateArray();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] array, int count, int[] expected) {
        rotateArray.rotate(array, count);
        Assertions.assertArrayEquals(expected, array);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5,6,7}, 3, new int[]{5,6,7,1,2,3,4}),
                Arguments.of(new int[]{-1,-100,3,99}, 2, new int[]{3,99,-1,-100}),
                Arguments.of(new int[]{-1,-100}, 3, new int[]{-100, -1})
        );
    }
}
