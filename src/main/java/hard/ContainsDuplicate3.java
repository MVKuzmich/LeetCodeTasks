package hard;

public class ContainsDuplicate3 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; Math.abs(i - j) <= indexDiff && j < nums.length; j++) {
                if(Math.abs(nums[i] - nums[j]) <= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }
}
