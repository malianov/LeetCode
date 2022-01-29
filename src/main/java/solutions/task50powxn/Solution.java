package solutions.task50powxn;

public class Solution {
    public double myPow(double x, int n) {
        double result;
        if (n == 0) {
            System.out.println("res = 0");
            result = 1;
        } else if (x == 1d) {
            System.out.println("res = 1d");
            result = 1;
        } else if (n == 1) {
            System.out.println("res = 1");
            result = x;
        } else if (n > 0) {
            System.out.println("res > 0");
            result = x;
            for (int i = 1; i < n; i++) {
                result *= x;
            }
        } else {
            result = 1 / x;
            if (n == Integer.MIN_VALUE) {
                n = (n + 1) * (-1);
            } else {
                n *= -1;
            }

            for (int i = 1; i < n; i++) {
                result = result / x;
                if (result == 0.000000) {
                    return result;
                }
            }
        }

        return ((int) (result * 100000)) / 100000.0;
    }
}
