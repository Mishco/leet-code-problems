package easy;

public class FindJudge {

    // fixme add unit tests
    public int findJudge(int n, int[][] trust) {
        int[] trustCounts = new int[n + 1];
        int[] trustedByCounts = new int[n + 1];

        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            trustCounts[a]++;
            trustedByCounts[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == 0 && trustedByCounts[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
