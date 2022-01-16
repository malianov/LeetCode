package solutions.task7reverseinteger;

public class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            result += x % 10;
            x = x / 10;

            if (x != 0) {
                if (result * 10 / 10 != result) {
                    return 0;
                }
                result *= 10;
            }
        }
        return result;
    }
}