package medium.array.backtracking;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class CombinationSum2Test {

    private CombinationSum2 combinationSum2;

    @BeforeEach
    void init() {
        combinationSum2 = new CombinationSum2();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void combinationSum(int[] candidates, int target, List<List<Integer>> expected) {
        Assertions.assertThat(combinationSum2.combinationSumRecursive(candidates, target)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 2, 1, 2}, 5, List.of(List.of(1, 2, 2), List.of(5))),
                Arguments.of(new int[]{1}, 1, List.of(List.of(1))),
                Arguments.of(new int[]{1, 1}, 2, List.of(List.of(1, 1)))
        );
    }
}