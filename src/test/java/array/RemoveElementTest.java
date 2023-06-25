package array;

import easy.array.RemoveElement;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    private RemoveElement removeElement;

    @BeforeEach
    void init() {
        removeElement = new RemoveElement();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void removeElement(int[] array, int val, int expected) {
        Assertions.assertThat(removeElement.removeElement(array, val)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5)
        );
    }
}