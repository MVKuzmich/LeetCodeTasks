import easy.ContainsDuplicate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void prepare() {
        containsDuplicate = new ContainsDuplicate();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseTrue")
    void checkMethodCaseTrue(int[] nums) {
        Assertions.assertThat(containsDuplicate.containsDuplicate(nums)).isTrue();
    }
    @ParameterizedTest
    @MethodSource("getDataCaseFalse")
    void checkMethodCaseFalse(int[] nums) {
        Assertions.assertThat(containsDuplicate.containsDuplicate(nums)).isFalse();
    }

    static Stream<Arguments> getDataCaseTrue() {
        return Stream.of(
                Arguments.of(new int[]{1, 2,2, 4, 5})
        );
    }
    static Stream<Arguments> getDataCaseFalse() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5})
        );
    }

}
