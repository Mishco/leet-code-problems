package strings;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder sr = new StringBuilder();
        var words = s.split(" ");
        for (var word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sr.append(word.charAt(i));
            }
            sr.append(' ');
        }

        return sr.toString().strip();
    }

}
