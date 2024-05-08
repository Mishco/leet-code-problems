package easy;

import java.util.HashMap;

public class Solution387 {
    public int firstUniqChar(String s) {
        // Given a string s,
        // find the first non-repeating character in it and
        // return its index.
        // If it does not exist, return -1.
        HashMap<Character, Integer> repeatingStr = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            repeatingStr.put(s.charAt(i), repeatingStr.getOrDefault(s.charAt(i), 0) + 1);

        }
        System.out.println(repeatingStr);


        for (int i = 0; i < s.length(); i++) {
            var currentChar = s.charAt(i);
            int valueAt = repeatingStr.getOrDefault(currentChar, 0);
            if (valueAt == 1) {
                return i;
            }
        }
        return -1;
    }
}
