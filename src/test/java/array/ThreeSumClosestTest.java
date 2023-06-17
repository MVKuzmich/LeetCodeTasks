package array;

import medium.array.ThreeSumClosest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    public ThreeSumClosest threeSumClosest;

    @BeforeEach
    void init() {
        threeSumClosest = new ThreeSumClosest();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void threeSumClosest(int[] input, int target, int expected) {
        Assertions.assertThat(threeSumClosest.threeSumClosest(input, target)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2),
                Arguments.of(new int[]{0, 0, 0}, 1, 0)
        );
    }
}