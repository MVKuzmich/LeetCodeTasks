package medium;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        outer: while (i < numbers.length - 1) {
            int j = i + 1;
            while (j < numbers.length && numbers[j] + numbers[i] <= target) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break outer;
                }
                j++;
            }
            i++;
        }

        return result;
    }
}
