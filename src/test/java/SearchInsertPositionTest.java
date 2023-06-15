import easy.SearchInsertPosition;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void prepare() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] array, int target, int expected) {
        Assertions.assertThat(searchInsertPosition.searchInsert(array, target)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[]{1,3,5,6}, 5, 2),
                Arguments.of(new int[]{1,3,5,6}, 2, 1),
                Arguments.of(new int[]{1,3,5,6}, 7, 4)
        );
    }
}
