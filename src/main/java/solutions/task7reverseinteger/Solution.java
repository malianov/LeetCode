package solutions.task7reverseinteger;

public class Solution {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x).reverse();

        if (x < 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        Double result = Double.valueOf(stringBuilder.toString());

        if (result >= Integer.MAX_VALUE) {
            return 0;
        }

        return (x < 0) ? result.intValue() * (-1) : result.intValue();
    }
}
