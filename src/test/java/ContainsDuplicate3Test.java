import hard.ContainsDuplicate3;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ContainsDuplicate3Test {

    private ContainsDuplicate3 containsDuplicate3;

    @BeforeEach
    void prepare() {
        containsDuplicate3 = new ContainsDuplicate3();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseTrue")
    void checkMethodCaseTrue(int[] array, int indexDiff, int valueDiff) {
        Assertions.assertThat(containsDuplicate3.containsNearbyAlmostDuplicate(array, indexDiff, valueDiff)).isTrue();
    }

    static Stream<Arguments> getDataCaseTrue() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1}, 3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getDataCaseFalse")
    void checkMethodCaseFalse(int[] array, int indexDiff, int valueDiff) {
        Assertions.assertThat(containsDuplicate3.containsNearbyAlmostDuplicate(array, indexDiff, valueDiff)).isFalse();
    }

    static Stream<Arguments> getDataCaseFalse() {
        return Stream.of(
                Arguments.of(new int[]{1,5,9,1,5,9}, 2, 3)
        );
    }
}
