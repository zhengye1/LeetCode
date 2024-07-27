package vincent.leetcode.customAtoi;

/**
 * LeetCode #8
 */
public class CustomAtoi {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int index = 0;
        int sign = 1;

        //trim the space
        while (index < chars.length && chars[index] == ' ') {
            index++;
        }

        //finish trimming and all space gone
        if (index == chars.length) {
            return 0;
        }

        // check the current position contains '-' or '+'
        if (chars[index] == '-') {
            sign = -1;
            index++;
        } else if (chars[index] == '+') {
            index++;
        }

        int res = 0;
        while (index < chars.length) {
            char currChar = chars[index];

            if (currChar > '9' || currChar < '0') {
                break;
            }
            // need to do a pre-check that if it pass the maximum or minumum
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            res = res * 10 + sign * (currChar - '0');
            index++;

        }
        return res;
    }
}
