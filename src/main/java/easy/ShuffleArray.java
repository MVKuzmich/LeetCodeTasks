package easy;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            index += 2;
        }
        index = 1;
        for (int i = n; i < nums.length; i++) {
            result[index] = nums[i];
            index += 2;
        }
        return result;
    }
}
