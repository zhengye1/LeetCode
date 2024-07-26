package vincent.leetcode.longestPalindrome;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int len = s.length();
        int[] arr1 = new int[len]; //以每个位置为中心的回文串的最大长度
        int[] arr2 = new int[len]; //以每个位置为左中心的回文串的最大长度
        for (int i = 0; i < len; i++) {
            centerExpand(charArray, arr1, i, i);
            centerExpand(charArray, arr2, i, i + 1);
        }
        int max = 0, maxIndex = 0;
        boolean isArr1 = true;
        for (int i = 0; i < len; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
                maxIndex = i;
                isArr1 = false;
            }
        }
        if (isArr1) {
            return s.substring(maxIndex - max / 2, maxIndex + max / 2 + 1);
        } else {
            return s.substring(maxIndex - max / 2 + 1, maxIndex + max / 2 + 1);
        }
    }

    public void centerExpand(char[] charArray, int[] arr, int left, int right) {
        int i = left, j = right;
        while (i >= 0 && j < charArray.length && charArray[i] == charArray[j]) {
            i--;
            j++;
        }
        arr[left] = j - i - 1; //奇数偶数都是一样的
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.longestPalindrome("daba");
    }
}
