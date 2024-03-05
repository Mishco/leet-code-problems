package strings;

public class MinimumLenStringAfterDeleteEnds {

    public int minimumLength(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            var c = s.charAt(i);

            while (i < n && s.charAt(i) == c) {
                i++;
            }
            while (j >= 0 && s.charAt(j) == c) {
                j--;
            }
        }
        if (i == j) {
            return 1;
        }
        if (i > j) {
            return 0;
        }


        return j - i + 1;
    }
}
