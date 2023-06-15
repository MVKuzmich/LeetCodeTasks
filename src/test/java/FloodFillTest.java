import easy.FloodFill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class FloodFillTest {

    private FloodFill floodFill;

    @BeforeEach
    void prepare() {
        floodFill = new FloodFill();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[][] givenArray, int m, int n, int color, int[][] expected) {
        floodFill.floodFill(givenArray, m, n, color);
        Assertions.assertTrue(Arrays.deepEquals(givenArray, expected));

    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2, new int[][]{{2,2,2}, {2,2,0}, {2,0,1}})
        );
    }
}
