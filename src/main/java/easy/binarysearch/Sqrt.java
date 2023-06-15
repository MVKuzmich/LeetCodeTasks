package easy.binarysearch;

public class Sqrt {
    public int mySqrt(int x) {
        int right = x;
        int left = 0;
        if (right * right == x) {
            return right;
        }
        while (right - left != 1) {
            int middle = (left + right) / 2;
            long multiply = (long) middle * middle;
            if (multiply == x) {
                return middle;
            } else if (multiply > x) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return left;
    }
}
