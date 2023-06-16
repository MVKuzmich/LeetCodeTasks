package medium.array;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < 0 || (left > i + 1 && nums[left] == nums[left - 1])) {
                        left++;
                    } else if (sum > 0 || (right < nums.length - 1 && nums[right] == nums[right + 1])) {
                        right--;
                    } else {
                        List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                        result.add(triplet);
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
