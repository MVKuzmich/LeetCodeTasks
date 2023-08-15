package easy.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) {
            return result;
        }
        List<Integer> previousRow = new ArrayList<>();
        previousRow.add(1);
        result.add(previousRow);

        for (int i = 2; i <= numRows; i++) {
           List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1); //add first element into current row
            for (int j = 0; j < previousRow.size() - 1; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j + 1)); //fill in middle part
            }
            currentRow.add(1);//add last element into row
            result.add(currentRow);
            previousRow = currentRow;
        }

        return result;
    }
}
