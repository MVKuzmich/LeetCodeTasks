package medium.string;

import java.util.*;

public class PhoneLetterCombinations {

    public List<String> letterCombinations(String digits) {
        Map<String, String> map = Map.of(
                "2", "abc",
                "3", "def",
                "4", "ghi",
                "5", "jkl",
                "6", "mno",
                "7", "pqrs",
                "8", "tuv",
                "9", "wxyz"
        );
        if (digits.equals("")) {
            return Collections.emptyList();
        }
        if(digits.length() == 1) {
            return Arrays.asList(map.get(digits).split(""));
        }

        List<String> letters = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            letters.add(map.get(String.valueOf(digits.charAt(i))));
        }

        return getAllCombinations(letters);
    }

    private List<String> getAllCombinations(List<String> letters) {
        List<String> combinations = new ArrayList<>();


        return combinations;
    }
}
