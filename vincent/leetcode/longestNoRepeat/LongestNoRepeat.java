package vincent.leetcode.longestNoRepeat;

/**
 * LeetCode #3
 */
public class LongestNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置, ASCII一共128个，使用的方法叫滑动窗口
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
