import medium.FindAnagrams;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class findAnagramsTest {

    private FindAnagrams findAnagrams;

    @BeforeEach
    void prepare() {
        findAnagrams = new FindAnagrams();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(String text, String pattern, List<Integer> expected) {
        Assertions.assertThat(findAnagrams.findAnagrams(text, pattern)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of("cbaebabacd", "abc", List.of(0, 6)),
                Arguments.of("abab", "ab", List.of(0, 1, 2))
        );
    }
}
