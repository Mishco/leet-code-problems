package math;

public class Palindrome {

    public boolean isPalindrome(int x) {
        // with String
        //        StringBuilder sample = new StringBuilder();
        //        sample.append(x);
        //
        //        for (int i = 0; i < sample.length(); i++) {
        //            if (sample.charAt(i) != sample.charAt(sample.length() - i - 1)) {
        //                return false;
        //            }
        //        }
        //        return true;

        //Let's take the number 12321 in base 10 (decimal).
        //
        //In this case, k = 4 and the digits are a4 = 1, a3 = 2, a2 = 3, a1 = 2, and a0 = 1.
        //
        //To check if this number is palindromic, we need to compare the digits from left to right with the digits from right to left.
        //
        //a0 = a4, a1 = a3, so the number is palindromic in base 10.
        int temp = x;
        int reverse = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return x == reverse;
    }
}
