package array;

import medium.array.FourSum;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {

    private FourSum fourSum;

    @BeforeEach
    void init() {
        fourSum = new FourSum();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void testFourSumMethod(int[] array, int target, List<List<Integer>> expected) {
        Assertions.assertThat(fourSum.fourSum(array, target)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, -1, 0, -2, 2}, 0, List.of(List.of(-2,-1,1,2), List.of(-2,0,0,2), List.of(-1,0,0,1))),
                Arguments.of(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296,
                        Collections.emptyList())
        );
    }
}