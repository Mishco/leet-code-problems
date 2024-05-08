package easy;

public class PivotInteger2485 {

    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int lo = 1;
        int hi = n;
        while (lo <= hi) {
            int x = lo + (hi - lo) / 2;
            int below = (x - 1) * x / 2;
            int left = below + x;
            int right = total - below;

            if (left == right) {
                return x;
            } else if (left < right) {
                lo = x + 1;
            } else {
                hi = x - 1;
            }

        }
        return -1;
    }

}
