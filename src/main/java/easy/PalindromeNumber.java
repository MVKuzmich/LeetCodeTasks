package easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String reverse = new StringBuilder(String.valueOf(x)).reverse().toString();
        return String.valueOf(x).equals(reverse);
    }
}

