package string;

import medium.string.PhoneLetterCombinations;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class PhoneLetterCombinationsTest {

    private PhoneLetterCombinations combinations;

    @BeforeEach
    void prepare() {
        combinations = new PhoneLetterCombinations();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(String digits, List<String> expected) {
        Assertions.assertThat(combinations.letterCombinations(digits)).isEqualTo(expected);

    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        );
    }
}
