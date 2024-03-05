package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

    private static final int numberOfAlphabet = 26;

    public List<String> commonChars(String[] words) {
        List<String> ret = new ArrayList<>();

        int[] minFreq = new int[numberOfAlphabet];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (var word : words) {
            int[] frr = new int[numberOfAlphabet];

            for (char c : word.toCharArray()) {
                frr[c - 'a']++;
            }

            for (int i = 0; i < numberOfAlphabet; i++) {
                minFreq[i] = Math.min(minFreq[i], frr[i]);
            }
        }
        int count;
        for (char c = 'a'; c <= 'z'; c++) {
            count = minFreq[c - 'a'];
            for (int i = 0; i < count; i++) {
                ret.add(String.valueOf(c));
            }
        }
        return ret;
    }
}
