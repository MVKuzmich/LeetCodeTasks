package easy;

public class MoveZero {

    public void moveZeroes(int[] nums) {
        int countShift = 0;
        for(int i = 0; i < nums.length - countShift; i++) {
            if(nums[i] == 0) {
                int temp = nums[i];
                for(int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[nums.length - 1] = temp;
                countShift++;
                i--;
            }
        }
    }
}
