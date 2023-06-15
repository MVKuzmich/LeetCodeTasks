package easy.string;

import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        Map<String, String> map = Map.of(
                "(", ")",
                "{", "}",
                "[", "]");
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            String par = String.valueOf(s.charAt(i));
            if (map.containsKey(par)) {
                stack.add(par);
            } else {
                if (!map.get(stack.removeLast()).equals(par)) {
                    return false;
                }
            }
        }
        return true;
    }
}
