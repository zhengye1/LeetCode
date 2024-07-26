package vincent.leetcode.longestNoRepeat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestNoRepeatTest {
    LongestNoRepeat noRepeat = new LongestNoRepeat();

    @Test
    public void testCase1(){
        assertEquals(3, noRepeat.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testCase2(){
        assertEquals(1, noRepeat.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testCase3(){
        assertEquals(3, noRepeat.lengthOfLongestSubstring("pwwkew"));
    }
}
