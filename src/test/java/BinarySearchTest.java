import easy.BinarySearch;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void prepare() {
        binarySearch = new BinarySearch();
    }
    @ParameterizedTest
    @MethodSource("getDataForMethod")
    void checkMethod(int[] array, int find, int index) {
        Assertions.assertThat(binarySearch.search(array, find)).isEqualTo(index);
    }

    static Stream<Arguments> getDataForMethod() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,3,5,9,12}, 9, 4)
        );
    }

}
