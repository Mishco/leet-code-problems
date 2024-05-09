package medium;

import java.util.Arrays;

public class Solution3075MaximizeHappinessSelectedChildren {

    public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;

        Arrays.sort(happiness);

        int len = happiness.length;

        int j = 0;
        for (int i = len - 1; i >= len - k; i--) {
            happiness[i] = Math.max(happiness[i] - j, 0);
            j++;
            sum += happiness[i];
        }

        return sum;
    }

}
