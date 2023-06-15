package test.java;

import easy.PalindromeNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void prepare() {
        palindromeNumber = new PalindromeNumber();
    }

    @ParameterizedTest
    @ValueSource(ints = {121, 1441})
    void checkMethod(int given) {
        Assertions.assertThat(palindromeNumber.isPalindrome(given)).isTrue();
    }
}
