package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        Map<Integer, List<Integer>> cache = new HashMap<>();
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> previousRow = cache.get(i - 1);
                    int left = previousRow.get(j - 1);
                    int right = previousRow.get(j);
                    row.add(left + right);
                }
            }
            cache.put(i, row);
            triangle.add(row);
        }
        return triangle;
    }
}
