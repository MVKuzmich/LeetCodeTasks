package string;

import easy.string.LongestPrefix;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LongestPrefixTest {

    private LongestPrefix longestPrefix;


    @BeforeEach
    void prepare() {
        longestPrefix = new LongestPrefix();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(String[] array, String expected) {
        Assertions.assertThat(longestPrefix.longestCommonPrefix2(array)).isEqualTo(expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, "")
        );
    }
}
