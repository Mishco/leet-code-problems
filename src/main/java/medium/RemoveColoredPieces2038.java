package medium;

public class RemoveColoredPieces2038 {

    public boolean winnerOfGame(String colors) {
        // true if Alice wins or return false is Bob wins
        int n = colors.length();
        int[] players = new int[2];

        if (n < 3) {
            return false;
        }

        int prev2 = colors.charAt(0);
        int prev1 = colors.charAt(1);

        for (char c : colors.substring(2).toCharArray()) {
            if (c == prev1 && c == prev2) {
                players[c - 'A']++;
            }
            prev2 = prev1;
            prev1 = c;
        }
        return players[0] > players[1];


//        int[][] dp = new int[n][n * 2];
//
//        // Alice or Bob starts
//        dp[n - 1][0] = (colors.charAt(n - 1) == 'A') ? 1 : 0;
//        dp[n - 1][1] = (colors.charAt(n - 1) == 'B') ? 1 : 0;
//
//        for (int i = n - 2; i >= 1; i--) {
//            if (colors.charAt(i) == 'B') {
//                dp[i][0] = 0;
//                dp[i][1] = dp[i + 1][0] + 1;
//            } else {
//                if (i + 2 < n && colors.charAt(i + 1) == 'A' && colors.charAt(i + 2) == 'A') {
//                    dp[i][0] = dp[i + 1][1] + 1;
//                    dp[i][1] = dp[i + 1][0];
//                } else {
//                    dp[i][0] = 0;
//                    dp[i][1] = dp[i + 1][0];
//                }
//            }
//        }
//
//        return dp[0][0] > 0;
    }

}
