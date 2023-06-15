import medium.LongestSubstrWithoutRepeating;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class LongestSubstrWithoutRepeatingTest {

    private LongestSubstrWithoutRepeating longestSubstrWithoutRepeating;

    @BeforeEach
    void prepare() {
        longestSubstrWithoutRepeating = new LongestSubstrWithoutRepeating();
    }

    @ParameterizedTest
    @CsvSource(value = {"textdext2rab cdaaab, 10",
            "text, 3",
            "pwwkew, 3",
            "a, 1",
            "'', 0"})
    void longestSubstrWithoutRepeatingTest(String text, int expected) {
        assertThat(longestSubstrWithoutRepeating.lengthOfLongestSubstring(text)).isEqualTo(expected);

    }


}
