package array;

import medium.array.ThreeSum;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    private ThreeSum threeSum;

    @BeforeEach
    void init() {
        threeSum = new ThreeSum();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkThreeSumMethod(int[] input, List<List<Integer>> expected) {
        Assertions.assertThat(threeSum.threeSum(input)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, Collections.emptyList()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.of(new int[]{-2, 0, 1, 1, 2}, List.of(List.of(-2, 0, 2), List.of(-2, 1, 1))),
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4},
                        List.of(List.of(-4, 0, 4),
                                List.of(-4, 1, 3),
                                List.of(-3, -1, 4),
                                List.of(-3, 0, 3),
                                List.of(-3, 1, 2),
                                List.of(-2, -1, 3),
                                List.of(-2, 0, 2),
                                List.of(-1, -1, 2),
                                List.of(-1, 0, 1)
                        ))
        );

    }


}