package easy.dynamicprogramming;

public class ClimbingStairs {

    /*
    Fibonacci approach
    result = F(n - 1) + F(n - 2)
     */
    public int climbStairs(int n) {
        int firstFib = 0;
        int secondFib = 1;
        while (n > 1) {
            int next = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = next;
            n--;
        }

        return firstFib + secondFib;
    }

}
