import easy.TwoSum;
import medium.TwoSum2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSum2Test {

    private TwoSum2 twoSum2;

    @BeforeEach
    void prepare() {
        twoSum2 = new TwoSum2();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] array, int target, int[] expected) {
        Assertions.assertThat(twoSum2.twoSum(array, target)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2,3,4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2}),
                Arguments.of(new int[]{5, 25, 75}, 100, new int[]{2, 3}),
                Arguments.of(new int[]{-1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, -2, new int[]{1, 2})

        );
    }

}
