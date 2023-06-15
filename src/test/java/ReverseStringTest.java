import easy.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    void prepare() {
        reverseString = new ReverseString();
    }

    @ParameterizedTest
    @MethodSource("getData")
    void checkMethod(char[] array, char[] expected) {
        reverseString.reverseString(array);
        Assertions.assertArrayEquals(array, expected);
    }

    static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}),
                Arguments.of(new char[]{'H','a','n','n','a','h'}, new char[]{'h','a','n','n','a','H'})
        );
    }

}
