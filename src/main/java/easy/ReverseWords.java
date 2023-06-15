package easy;

import java.util.Arrays;

public class ReverseWords {

    public String reverseWords(String s) {
        int start = 0;
        int end = s.indexOf(" ", start);
        char[] array = s.toCharArray();
        while (end > 0) {
            reverseString(array, start, end - 1);
            start = end + 1;
            end = s.indexOf(" ", start);
        }
        return new String(reverseString(array, start, s.length() -1));
}

    public char[] reverseString(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }
}

