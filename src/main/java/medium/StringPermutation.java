package medium;

import java.util.*;
import java.util.stream.Collectors;

public class StringPermutation {

    public boolean checkInclusion(String permutationStr, String sentence) {
        int permutationStrLength = permutationStr.length();
        int sentenceLength = sentence.length();
        // If s1 length > s2 length
        if (permutationStrLength > sentenceLength) return false;
        //Create two HashMap for s1 and s2
        HashMap<Character, Integer> permutationStrFrequencyMap = new HashMap<>();
        HashMap<Character, Integer> sentenceFrequencyMap = new HashMap<>();
        // Fill s1frequencyMap
        for (char ch : permutationStr.toCharArray()) {
            permutationStrFrequencyMap.put(ch, permutationStrFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        // create a window for the size s1
        int i = 0;
        int j = -1;
        for (; i < permutationStrLength - 1; i++) {
            char ch = sentence.charAt(i);
            sentenceFrequencyMap.put(ch, sentenceFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        //Acquire and Release Strategy or Sliding Window
        i--;
        while (i < sentenceLength - 1) {
            i++;
            char ch = sentence.charAt(i);
            sentenceFrequencyMap.put(ch, sentenceFrequencyMap.getOrDefault(ch, 0) + 1);
            if (isPermutation(permutationStrFrequencyMap, sentenceFrequencyMap)) {
                return true;
            }
            j++;
            ch = sentence.charAt(j);
            sentenceFrequencyMap.put(ch, sentenceFrequencyMap.get(ch) - 1);
            if (sentenceFrequencyMap.get(ch) == 0) sentenceFrequencyMap.remove(ch);

        }
        return false;

    }

    public boolean isPermutation(HashMap<Character, Integer> s1FrequencyMap, HashMap<Character, Integer> s2FrequencyMap) {
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            int f1 = s1FrequencyMap.getOrDefault(ch, 0);
            int f2 = s2FrequencyMap.getOrDefault(ch, 0);
            if (f1 != f2) return false;
        }
        return true;
    }
}
