package easy.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private ClimbingStairs climbingStairs;

    @BeforeEach
    void init() {
        climbingStairs = new ClimbingStairs();
    }

    @ParameterizedTest
    @CsvSource({"4, 5", "2, 2", "3, 3"})
    void checkMethod(int step, int expected) {
        org.assertj.core.api.Assertions.assertThat(climbingStairs.climbStairs(step)).isEqualTo(expected);
    }

}