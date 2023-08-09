package array;

import medium.array.ValidSudoku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    private ValidSudoku validSudoku;

    @BeforeEach
    void init() {
        validSudoku = new ValidSudoku();
    }

    @ParameterizedTest
    @MethodSource("getDataTrueCase")
    void checkMethodTrueCase(char[][] board, boolean expected) {
        Assertions.assertTrue(validSudoku.isValidSudoku(board));
    }

    @ParameterizedTest
    @MethodSource("getDataFalseCase")
    void checkMethodFalseCase(char[][] board) {
        Assertions.assertFalse(validSudoku.isValidSudoku(board));
    }

    static Stream<Arguments> getDataTrueCase() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                })
        );
    }
    static Stream<Arguments> getDataFalseCase() {
        return Stream.of(
                Arguments.of(new char[][]{
                        {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                })
        );
    }
}