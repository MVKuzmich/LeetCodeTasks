package medium.array;


public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxVolumeContainer = Integer.MIN_VALUE;
        while(left != right) {
            int container = Math.min(height[left], height[right]) * (right - left);
            if(container > maxVolumeContainer) {
                maxVolumeContainer = container;
            }
            if(height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxVolumeContainer;
    }
}
