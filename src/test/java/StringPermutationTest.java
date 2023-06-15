import medium.StringPermutation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

public class StringPermutationTest {

    private StringPermutation stringPermutation;

    @BeforeEach
    void prepare() {
        stringPermutation = new StringPermutation();
    }

    @ParameterizedTest
    @MethodSource("getDataPermuteMethod")
    void checkPermuteMethodCaseTrue(String permutationString, String sentence) {
        Assertions.assertThat(stringPermutation.checkInclusion(permutationString, sentence)).isTrue();
    }

    static Stream<Arguments> getDataPermuteMethod() {
        return Stream.of(
                Arguments.of("ab", "eidbaooo"),
                Arguments.of("abc", "eidbacooo"),
                Arguments.of("abcd", "eidbacooo")
        );
    }
}
