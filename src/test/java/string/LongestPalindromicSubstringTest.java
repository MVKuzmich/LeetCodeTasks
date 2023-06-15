package string;

import medium.string.LongestPalindromicSubstring;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    void prepare() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @ParameterizedTest
    @CsvSource(value = {"babad, bab", "cbbd, bb", "a, a", "eabcb, bcb", "bb, bb"})
    void checkMethod(String given, String expected) {
        Assertions.assertThat(longestPalindromicSubstring.longestPalindrome(given)).isEqualTo(expected);
    }
}
