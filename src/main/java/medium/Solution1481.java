package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1481 {


    /**
     * Given an array of integers arr and an integer k.
     * Find the least number of unique integers after removing exactly k elements.
     *
     * @param arr input array
     * @param k   remove exactly k elements
     * @return number of the least number unique integers
     */
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();
        for (int element : arr) {
            occurenceMap.put(element, occurenceMap.getOrDefault(element, 0) + 1);
        }

//        System.out.println(occurenceMap);
        List<Integer> frequencyList = occurenceMap.values().stream()
                .sorted()
                .toList();

        var numberUnique = frequencyList.size();

        for (int frequency : frequencyList) {
            if (k >= frequency) {
                k -= frequency;
                numberUnique--;
            } else {
                break;
            }
        }

        return numberUnique;
    }

}
