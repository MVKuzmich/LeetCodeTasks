package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerifyAlien {

    public boolean isAlienSorted(String[] words, String order) {
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        wordList.sort((o1, o2) -> {
            String[] o1letters = o1.split("");
            String[] o2letters = o2.split("");
            int loopLength = Math.min(o1.length(), o2.length());
            for(int i = 0; i < loopLength; i++) {
                if(order.indexOf(o1letters[i]) > order.indexOf(o2letters[i])) {
                    return 1;
                } else if(order.indexOf(o1letters[i]) < order.indexOf(o2letters[i])) {
                    return -1;
                }
            }
            return o1.length() == o2.length() ? 0 : (o1.length() - o2.length());
        });
        return Arrays.equals(words, wordList.toArray(String[]::new));
    }


}
