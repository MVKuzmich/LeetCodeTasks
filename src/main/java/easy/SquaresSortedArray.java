package easy;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for(int num : nums) {
            result[index++] = num * num;
        }
        bubbleSortArray(result);
        return result;
    }

    public void bubbleSortArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        boolean swapNeeded = true;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
    }
}

