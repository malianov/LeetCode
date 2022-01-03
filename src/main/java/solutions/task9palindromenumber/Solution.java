package solutions.task9palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int y = x % 10;
        x = x / 10;

        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }

        if (y > x) {
            y /= 10;
        }
        return y == x;
    }
}
