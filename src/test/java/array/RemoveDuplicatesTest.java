package array;

import easy.array.RemoveDuplicates;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    void init() {
        removeDuplicates = new RemoveDuplicates();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void removeDuplicates(int[] array, int expected) {
        Assertions.assertThat(removeDuplicates.removeDuplicates(array)).isEqualTo(expected);

    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5)

        );
    }
}