package medium;

import java.math.BigInteger;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StringToInteger {

    public int myAtoi(String s) {
        String trimString = s.trim();
        if (!s.matches("\s*[+-]?[0-9]+[\\+\\-A-z0-9.\s]*?")) {
            return 0;
        } else {
            Matcher matcher = Pattern.compile("([-+]?)([0-9]*)").matcher(trimString);
            int result = 0;
            if (matcher.find()) {
                String sign = matcher.group(1);
                String number = matcher.group(2);
                number = trimNullFromStart(number);
                number = sign.equals("-") ? sign.concat(number) : number;
                BigInteger bigInteger = new BigInteger(number);
                if (bigInteger.compareTo(BigInteger.ZERO) < 0 && !String.valueOf(bigInteger.intValue()).equals(number)) {
                    result = Integer.MIN_VALUE;
                } else if (bigInteger.compareTo(BigInteger.ZERO) > 0 && !String.valueOf(bigInteger.intValue()).equals(number)) {
                    result = Integer.MAX_VALUE;
                } else {
                    result = Integer.parseInt(number);
                }

            }
            return result;
        }

    }

    public String trimNullFromStart(String s) {
        int index = 0;
        while (index < s.length() && s.charAt(index) == '0') {
            index++;
        }
        if(index < s.length()) {
            return s.substring(index);
        } else {
            return "0";
        }
    }
}

