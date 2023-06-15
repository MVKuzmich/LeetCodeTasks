import medium.IslandNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IslandNumberTest {

    private IslandNumber islandNumber;

    @BeforeEach
    void prepare() {
        islandNumber = new IslandNumber();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(char[][] given, int expected) {
        Assertions.assertThat(islandNumber.numIslands(given)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new char[][]{{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}}, 1)
        );
    }
}
