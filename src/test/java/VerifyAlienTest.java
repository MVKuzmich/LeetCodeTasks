import easy.VerifyAlien;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class VerifyAlienTest {

    private VerifyAlien verifyAlien;

    @BeforeEach
    void prepare() {
        verifyAlien = new VerifyAlien();
    }

    @ParameterizedTest
    @MethodSource("getDataCaseTrue")
    void checkMethodCaseTrue(String[] words, String order) {
        Assertions.assertThat(verifyAlien.isAlienSorted(words, order)).isTrue();
    }
    @ParameterizedTest
    @MethodSource("getDataCaseFalse")
    void checkMethodCaseFalse(String[] words, String order) {
        Assertions.assertThat(verifyAlien.isAlienSorted(words, order)).isFalse();
    }

    static Stream<Arguments> getDataCaseTrue() {
        return Stream.of(
                Arguments.of(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")
        );
    }
    static Stream<Arguments> getDataCaseFalse() {
        return Stream.of(
                Arguments.of(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"),
                Arguments.of(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz")
        );
    }

}
