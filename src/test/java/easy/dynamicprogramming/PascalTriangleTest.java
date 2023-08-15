package easy.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    private PascalTriangle pascalTriangle;

    @BeforeEach
    void init() {
        pascalTriangle = new PascalTriangle();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void generate(int rowCount, List<List<Integer>> expected) {
        Assertions.assertThat(pascalTriangle.generate(rowCount)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(5, List.of(List.of(1),
                                List.of(1, 1),
                                List.of(1, 2, 1),
                                List.of(1, 3, 3, 1),
                                List.of(1, 4, 6, 4, 1)
                        )
                )
        );
    }
}