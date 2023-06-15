package array;

import medium.array.ContainerWithMostWater;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void init() {
        containerWithMostWater = new ContainerWithMostWater();

    }

    @ParameterizedTest
    @MethodSource("getData")
    void testMaxAreaMethod(int[] input, int expectedResult) {
        Assertions.assertThat(containerWithMostWater.maxArea(input)).isEqualTo(expectedResult);

    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1,8,6,2,5,4,8,3,7}, 49),
                Arguments.of(new int[] {1, 1}, 1),
                Arguments.of(new int[] {2, 3, 4, 5, 18, 17, 6}, 17)
        );

    }

}