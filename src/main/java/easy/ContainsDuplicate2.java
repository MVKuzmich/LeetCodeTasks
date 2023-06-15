package easy;

import java.util.*;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> number2indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (number2indexes.containsKey(nums[i]) &&
                    Math.abs(number2indexes.get(nums[i]) - i) <= k) {
                return true;
            } else {
                number2indexes.put(nums[i], i);
            }
        }
        return false;
    }
}
