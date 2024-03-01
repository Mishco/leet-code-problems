package strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingChar {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> listOfIdx = new ArrayList<>();
        String word;
        for (int i = 0; i < words.length; i++) {
            word = words[i];
            if (word.indexOf(x) != -1) listOfIdx.add(i);
        }
        return listOfIdx;
    }

}
