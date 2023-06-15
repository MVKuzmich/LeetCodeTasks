package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = map.get(ch);
            if (i != s.length() - 1) {
                if ((ch == 'I' && map.get(s.charAt(i + 1)) > map.get(ch)) ||
                        (ch == 'X' && map.get(s.charAt(i + 1)) > map.get(ch)) ||
                        (s.charAt(i) == 'C' && map.get(s.charAt(i + 1)) > map.get(ch))) {
                    result -= digit;
                } else {
                    result += digit;
                }
            } else {
                result += digit;
            }
        }
        return result;
    }
}

