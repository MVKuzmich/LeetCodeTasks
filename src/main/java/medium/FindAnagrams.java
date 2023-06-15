package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        String pSort = sort(p);
        for(int i = 0; i <= s.length() - p.length(); i++) {
            String partSort = sort(s.substring(i, i + p.length()));
            if(partSort.equals(pSort)) {
                result.add(i);
            }
        }
        return result;
    }

    public String sort(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);

        return new String(array);
    }
}
