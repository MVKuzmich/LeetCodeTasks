import easy.ContainsDuplicate2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ContainsDublicate2Test {

    private ContainsDuplicate2 containsDuplicate2;

    @BeforeEach
    void prepare() {
        containsDuplicate2 = new ContainsDuplicate2();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseTrue")
    void checkMethodCaseTrue(int[] array, int k) {
        Assertions.assertThat(containsDuplicate2.containsNearbyDuplicate(array, k)).isTrue();
    }

    static Stream<Arguments> getDataCaseTrue() {
        return Stream.of(
                Arguments.of(new int[]{1,0,1,1}, 1)
        );
    }
}
