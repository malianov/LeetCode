package solutions.task12integertoroman;

public class Solution {
    public String intToRoman(int num) {
        int value = num;
        StringBuilder result = new StringBuilder();

        if (value / 1000 > 0) {
            int qty = value / 1000;
            result.append("M".repeat(qty));
            value -= 1000 * qty;
        }

        if (value / 900 > 0) {
            int qty = value / 900;
            result.append("CM".repeat(qty));
            value -= 900 * qty;
        }

        if (value / 500 > 0) {
            int qty = value / 500;
            result.append("D".repeat(qty));
            value -= 500 * qty;
        }

        if (value / 400 > 0) {
            int qty = value / 400;
            result.append("CD".repeat(qty));
            value -= 400 * qty;
        }

        if (value / 100 > 0) {
            int qty = value / 100;
            result.append("C".repeat(qty));
            value -= 100 * qty;
        }

        if (value / 90 > 0) {
            int qty = value / 90;
            result.append("XC".repeat(qty));
            value -= 90 * qty;
        }

        if (value / 50 > 0) {
            int qty = value / 50;
            result.append("L".repeat(qty));
            value -= 50 * qty;
        }

        if (value / 40 > 0) {
            int qty = value / 40;
            result.append("XL".repeat(qty));
            value -= 40 * qty;
        }

        if (value / 10 > 0) {
            int qty = value / 10;
            result.append("X".repeat(qty));
            value -= 10 * qty;
        }

        if (value / 9 > 0) {
            int qty = value / 9;
            result.append("IX".repeat(qty));
            value -= 9 * qty;
        }

        if (value / 5 > 0) {
            int qty = value / 5;
            result.append("V".repeat(qty));
            value -= 5 * qty;
        }

        if (value / 4 > 0) {
            int qty = value / 4;
            result.append("IV".repeat(qty));
            value -= 4 * qty;
        }

        if (value > 0) {
            int qty = value;
            result.append("I".repeat(qty));
        }

        return result.toString();
    }
}
