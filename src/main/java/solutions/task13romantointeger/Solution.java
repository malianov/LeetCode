package solutions.task13romantointeger;

public class Solution {
    public int romanToInt(String s) {
        char[] stringArray = s.toCharArray();
        int size = s.length();
        int value = 0;

        for (int i = 0; i < size; i++) {
            switch (stringArray[i]) {
                case 'I':
                    if (i + 1 < size && stringArray[i + 1] == 'V') {
                        value += 4;
                        i++;
                    } else if (i + 1 < size && stringArray[i + 1] == 'X') {
                        value += 9;
                        i++;
                    } else {
                        value += 1;
                    }
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'X':
                    if (i + 1 < size && stringArray[i + 1] == 'L') {
                        value += 40;
                        i++;
                    } else if (i + 1 < size && stringArray[i + 1] == 'C') {
                        value += 90;
                        i++;
                    } else {
                        value += 10;
                    }
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'C':
                    if (i + 1 < size && stringArray[i + 1] == 'D') {
                        value += 400;
                        i++;
                    } else if (i + 1 < size && stringArray[i + 1] == 'M') {
                        value += 900;
                        i++;
                    } else {
                        value += 100;
                    }
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'M':
                    value += 1000;
                    break;
            }
        }
        return value;
    }
}
