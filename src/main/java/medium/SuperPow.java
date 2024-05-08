package medium;

public class SuperPow {

    private int powMod(int a, int b, int mod) {
        int result = 1;
        a %= mod;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }

            a = (a * a) % mod;
            b /= 2;
        }

        return result;
    }

    public int superPow(int a, int[] b) {
        if (a == 1) {
            return 1;
        }

        int result = 1;
        int mod = 1337;

        for (int i = b.length - 1; i >= 0; i--) {
            int digit = b[i];
            result = (result * powMod(a, digit, mod)) % mod;
            a = powMod(a, 10, mod);
        }
        return result;
    }
}
