package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CustomSortString {


    private static class OrderComparator implements Comparator<Character> {
        private final Map<Character, Integer> orderMap;

        public OrderComparator(Map<Character, Integer> orderMap) {
            this.orderMap = orderMap;
        }

        public int compare(Character x, Character y) {
            return orderMap.getOrDefault(x, orderMap.size()) - orderMap.getOrDefault(y, orderMap.size());
        }
    }

    public String customSortString(String order, String s) {
        //You are given two strings order and s.
        // All the characters of order are unique and were sorted
        // in some custom order previously.
        //
        // Permute the characters of s so that
        // they match the order that order was sorted.
        // More specifically, if a character x occurs
        // before a character y in order,
        // then x should occur before y in the permuted string.
        //
        // Return any permutation of s that satisfies this property.
        Character[] chars = new Character[s.length()];
        Map<Character, Integer> orderMap = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, new OrderComparator(orderMap));

        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }

}
