package easy;

public class StringCommonDivisor {

    public String gcdOfStrings(String str1, String str2) {
        int index = 0;
        String divisor = "";
        String maxDivisor = "";
        while((index < str1.length() && index < str2.length()) && str1.charAt(index) == str2.charAt(index)) {
            divisor = divisor.concat(String.valueOf(str1.charAt(index)));
            String str1ByDivisor = divisor.repeat(str1.length() / (index + 1));
            String str2ByDivisor = divisor.repeat(str2.length() / (index + 1));
            if(str1.equals(str1ByDivisor) && str2.equals(str2ByDivisor)) {
                maxDivisor = divisor;
            }
            index++;
        }
        return !maxDivisor.equals("") ? maxDivisor : "";
    }
}
