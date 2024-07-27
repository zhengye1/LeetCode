package vincent.leetcode.telphoneLetterCombine;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 17
 */
public class TelephoneLetterCombine {
    List<String> res = new ArrayList<>();
    StringBuilder str = new StringBuilder();

    public List<String> letterCombinations(String digits) {


        if (digits == null || digits.isEmpty()) {
            return res;
        }
        // create a telephone map
        String[] phoneMaps = new String[]{
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backTracing(digits, phoneMaps, 0);
        return res;
    }

    private void backTracing(String digits, String[] phoneMaps, int num) {
        if (num == digits.length()) {
            res.add(str.toString());
            return ;
        }
        String letters = phoneMaps[digits.charAt(num) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            str.append(letters.charAt(i));
            backTracing(digits, phoneMaps, num + 1);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
