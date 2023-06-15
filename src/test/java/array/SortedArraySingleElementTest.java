package array;

import medium.array.SortedArraySingleElement;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SortedArraySingleElementTest {

    private SortedArraySingleElement singleElement;

    @BeforeEach
    void prepare() {
        singleElement = new SortedArraySingleElement();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] given, int expected) {
        Assertions.assertThat(singleElement.singleNonDuplicate2(given)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}, 2),
                Arguments.of(new int[]{3, 3, 7, 7, 10, 11, 11}, 10),
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{1}, 1)
                );
    }

}
