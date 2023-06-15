import easy.ReverseWords;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseWordsTest {

    private ReverseWords reverseWords;

    @BeforeEach
    void prepare() {
        reverseWords = new ReverseWords();
    }

    @ParameterizedTest
    @CsvSource(value = {"Let's take LeetCode contest, s'teL ekat edoCteeL tsetnoc",
            "God Ding, doG gniD"})
    void checkMethod(String given, String expected) {
        Assertions.assertThat(reverseWords.reverseWords(given)).isEqualTo(expected);
    }


}
