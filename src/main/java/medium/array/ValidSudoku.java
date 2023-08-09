package medium.array;

import java.util.HashSet;


public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        HashSet<Integer>[] rows = new HashSet[9];
        HashSet<Integer>[] columns = new HashSet[9];
        HashSet<Integer>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {

                char sudokuUnit = board[row][column];

                if (sudokuUnit != '.') {
                    int number = sudokuUnit - '0';
                    int box = row / 3 * 3 + column / 3;

                    if (rows[row].contains(number) ||
                            columns[column].contains(number) ||
                            boxes[box].contains(number)) {
                        return false;
                    }

                    rows[row].add(number);
                    columns[column].add(number);
                    boxes[box].add(number);

                }

            }
        }
        return true;
    }
}
