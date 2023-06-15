package medium.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String palindromeWithMaxLength = "";
        int maxDelta = 1;
        for (int i = 0; i < s.length(); i++) {
            int startDelta = maxDelta;
            while (startDelta <= s.length()) {
                if (i + startDelta > s.length()) {
                    break;
                }
                String subStr = s.substring(i, i + startDelta);
                if (check(subStr) && subStr.length() > palindromeWithMaxLength.length()) {
                    palindromeWithMaxLength = subStr;
                    maxDelta = subStr.length();
                }
                startDelta++;
            }
        }
        return palindromeWithMaxLength;
    }

    public boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
