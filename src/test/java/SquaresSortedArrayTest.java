import easy.SquaresSortedArray;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SquaresSortedArrayTest {

    private SquaresSortedArray squaresSortedArray;

    @BeforeEach
    void prepare() {
        squaresSortedArray = new SquaresSortedArray();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(int[] given, int[] expected) {
        Assertions.assertThat(squaresSortedArray.sortedSquares(given)).isEqualTo(expected);
    }

    static Stream<Arguments> getData(){
        return Stream.of(
                Arguments.of(new int[]{-4,-1,0,3,10}, new int[]{0,1,9,16,100})
        );
    }

}
