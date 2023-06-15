package medium;

import java.util.stream.IntStream;

public class RotateArray {

    public void rotate(int[] nums, int countRotations) {
        for (int i = 0; i < countRotations; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}


