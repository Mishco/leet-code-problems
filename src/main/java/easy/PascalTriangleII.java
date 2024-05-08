package easy;

import java.util.List;

public class PascalTriangleII {

    private static List<List<Integer>> generatePascalTriangle(int numRows) {
        // call previous solution 118.PascalTriangle
        return new PascalTriangle().generate(numRows);
    }

    public List<Integer> getRow(int rowIndex) {
        return generatePascalTriangle(rowIndex + 1).get(rowIndex);
    }

}
