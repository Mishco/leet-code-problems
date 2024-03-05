package arrays;

import java.util.Arrays;

public class BagOfTokens948 {

    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int n = tokens.length;

        int score = 0;
        int maxScore = 0;
        int left = 0;       // index of 'smallest' token
        int right = n - 1;  // index of 'largest' token

        while (left <= right && (power >= tokens[left] || score > 0)) {
            while (left <= right && power >= tokens[left]) {
                // face up
                power -= tokens[left++];
                score++;
            }

            maxScore = Math.max(maxScore, score);

            if (left <= right && score > 0) {
                // face down
                power += tokens[right--];
                score--;
            }
        }

        return maxScore;
    }

}
