package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        } else {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                map.computeIfPresent(ch, (key, value) -> value + 1);
                map.putIfAbsent(ch, 1);
            }
            int counter = 0;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() >= 2 ) {
                    counter = (entry.getValue() % 2 == 0) ? counter + entry.getValue() : counter + entry.getValue() - 1;
                }
            }
            return (counter < s.length()) ? ++counter : counter;
        }
    }

    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}
