package medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int sumClosest = 0;
        int closedDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);
                if (diff < closedDiff) {
                    sumClosest = sum;
                    closedDiff = diff;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sumClosest;
    }
}
