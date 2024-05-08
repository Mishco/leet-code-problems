package easy;

public class FindTheDifference389 {

    public char findTheDifference(String s, String t) {
        // We can iterate through both strings and XOR the ASCII value of each character.
        // Since the added character will only appear once in string t,
        // its ASCII value will be the result of XORing
        // all the characters in string t and string s.
        int xor = 0;

        // XOR the ASCII values of each character in strings s and t
        for (char c : s.toCharArray()) {
            xor ^= c;
        }
        for (char c : t.toCharArray()) {
            xor ^= c;
        }

        // The result of XORing all the characters in strings s and t is the ASCII value of the added character
        return (char) xor;

//        Map<Character, Integer> count = new HashMap<>();
//
//        // Count the characters in string s
//        for (char c : s.toCharArray()) {
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        // Compare the counts of characters in strings s and t
//        for (char c : t.toCharArray()) {
//            if (!count.containsKey(c) || count.get(c) == 0) {
//                return c;
//            } else {
//                count.put(c, count.get(c) - 1);
//            }
//        }
//        return ' ';
    }
}
