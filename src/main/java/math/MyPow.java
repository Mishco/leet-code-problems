package math;

public class MyPow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }

//        double result=x;
//        int idx = 0;
//        if (n > 0) {
//            while (idx < n - 1) {
//                result *= x;
//                idx++;
//            }
//        } else {
//            while (idx < Math.abs(n - 1)) {
//                result /= x;
//                idx++;
//            }
//        }
//
//        int digits = 5;
//        double factor = Math.pow(10, digits);
//
//        return Math.floor(result * factor) / factor; // floor = 3.1415;
    }

}
