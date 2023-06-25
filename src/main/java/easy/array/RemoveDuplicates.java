package easy.array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount += 1;
            }
        }

        return uniqueCount;
    }
}
