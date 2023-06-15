package easy.string;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
        String minLengthStr = findStringWithMinLength(strs);
        StringBuilder prefix = new StringBuilder("");
        outer: for(int i = 0; i < minLengthStr.length(); i++) {
            char letter = minLengthStr.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(prefix.toString().concat(String.valueOf(letter)))) {
                    break outer;
                }
            }
            prefix.append(letter);
        }
        return prefix.toString();
    }

    public String findStringWithMinLength(String[] strs) {
        return Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");
    }

    public String longestCommonPrefix2(String[] strs) {
        String result = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.length() == 0) return "";
            }
        }

        return result;
    }
}
