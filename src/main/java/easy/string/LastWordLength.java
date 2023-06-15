package easy.string;

public class LastWordLength {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.lastIndexOf(" ") > 0 ? s.substring(s.lastIndexOf(" ") + 1).length() : s.length();
    }

    public int lengthOfLastWord2(String s) {
        String[] words = s.trim().split("\s+");
        return words[words.length - 1].length();
    }
}
