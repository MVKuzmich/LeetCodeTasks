package medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerToRoman {

    public String intToRoman(int num) {
        /*
        2789 -> 2000 - 700 - 80 - 9
         */
        List<String> result = new ArrayList<>();
        int countPower = 0;
        while (num > 0) {
            int digit = num % 10;
            result.add(findRoman(digit * (int) Math.pow(10, countPower)));
            num /= 10;
            countPower++;
        }
        Collections.reverse(result);

        return String.join("", result);

    }

    public String findRoman(int digit) {
        String roman = "";
        switch (digit) {
            case 4 -> roman = "IV";
            case 9 -> roman = "IX";
            case 40 -> roman = "XL";
            case 90 -> roman = "XC";
            case 400 -> roman = "CD";
            case 900 -> roman = "CM";
            default -> {
                Map<Integer, String> map = Map.of(
                        1, "I",
                        5, "V",
                        10, "X",
                        50, "L",
                        100, "C",
                        500, "D",
                        1000, "M");
                SortedSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
                set.addAll(map.keySet());
                for (Integer key : set) {
                    while (digit / key >= 1) {
                        if (digit % key == 0) {
                            return roman.concat(map.get(key).repeat(digit / key));
                        } else {
                            roman = roman.concat(map.get(key).repeat(digit / key));
                            digit %= key;
                        }
                    }
                }
            }
        }
        return roman;
    }


}

