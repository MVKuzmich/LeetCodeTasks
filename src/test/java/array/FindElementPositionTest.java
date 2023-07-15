package array;

import medium.array.FindElementPosition;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindElementPositionTest {

    private FindElementPosition findElementPosition;

    @BeforeEach
    void init() {
        findElementPosition = new FindElementPosition();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void searchRange(int[] array, int target, int[] expected) {
        Assertions.assertThat(findElementPosition.searchRange(array, target)).isEqualTo(expected);


    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, 1, new int[]{0, 0}),
                Arguments.of(new int[]{10}, 10, new int[]{0, 0}),
                Arguments.of(new int[]{10}, 5, new int[]{-1, -1}),
                Arguments.of(new int[]{}, 10, new int[]{-1, -1}),
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}),
                Arguments.of(new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1})

                );

    }
}