package hard;

import java.util.Arrays;
import java.util.Comparator;

// hard
public class MeetingRoomsIII {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int[] ans = new int[n];
        long[] times = new long[n];

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }

        int maxRooms = Arrays.stream(ans).max().orElse(0);
        for (int i = 0; i < n; i++) {
            if (ans[i] == maxRooms) {
                return i;
            }
        }
        return -1;

    }
}
