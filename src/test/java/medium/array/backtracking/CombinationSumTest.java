package medium.array.backtracking;

import easy.breadthfirstsearch.SameTree;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private CombinationSum combinationSum;

    @BeforeEach
    void init() {
        combinationSum = new CombinationSum();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void combinationSum(int[] candidates, int target, List<List<Integer>> expected) {
        Assertions.assertThat(combinationSum.combinationSumRecursive(candidates, target)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 6, 7}, 7, List.of(List.of(2, 2, 3), List.of(7))),
                Arguments.of(new int[]{2, 3, 5}, 8, List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)))
        );
    }
}