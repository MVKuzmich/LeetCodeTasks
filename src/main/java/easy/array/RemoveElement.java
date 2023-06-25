package easy.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int restElementCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[restElementCount] = nums[i];
                restElementCount += 1;
            }
        }

        return restElementCount;
    }
}
