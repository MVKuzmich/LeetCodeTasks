import medium.LongestPalindrome;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.Csv;

public class LongestPalindromeTest {

    private LongestPalindrome longestPalindrome;

    @BeforeEach
    void prepare() {
        longestPalindrome = new LongestPalindrome();
    }

    @ParameterizedTest
    @CsvSource(value = {"abccccdd, 7", "aabbccccdd, 10", "aabccccdd, 9", "abcd, 1"})
    void checkMethod(String str, int expected) {
        Assertions.assertThat(longestPalindrome.longestPalindrome2(str)).isEqualTo(expected);
    }
}
