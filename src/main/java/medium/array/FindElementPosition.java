package medium.array;

import java.util.Arrays;

public class FindElementPosition {

    public int[] searchRange(int[] nums, int target) {

        return new int[]{first(nums, target), last(nums, target)};
    }

    private int first(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int searchIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                searchIndex = mid;
                high = mid - 1;
            }
        }
        return searchIndex;
    }

    static int last(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int searchIndex = -1;
        while (low <= high) {
            // Normal Binary Search Logic
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                searchIndex = mid;
                low = mid + 1;
            }
        }
        return searchIndex;
    }
}
