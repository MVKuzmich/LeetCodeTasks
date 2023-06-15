package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstrWithoutRepeating {

    public int lengthOfLongestSubstring(String text) {
        Set<String> substringStore = new HashSet<>();
        for(int i = 0; i < text.length(); i++) {
            Set<String> distinctLetters = new HashSet<>();
            distinctLetters.add(String.valueOf(text.charAt(i)));
            for(int j = i + 1; j < text.length(); j++) {
                if(!distinctLetters.add(String.valueOf(text.charAt(j)))) {
                    break;
                }
            }
            substringStore.add(String.join("", distinctLetters));
        }
        return text.isEmpty() ? 0 : (int) substringStore.stream().mapToLong(String::length).max().getAsLong();

    }
}
