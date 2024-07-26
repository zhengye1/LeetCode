package vincent.leetcode.longestPalindrome;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void testCase1(){
        assertTrue(List.of("bab", "aba").contains(longestPalindrome.longestPalindrome("babad")));
    }



    @Test
    void testCase2(){
       assertEquals("bb", longestPalindrome.longestPalindrome("cbbd"));
    }

    @Test
    void testCase3(){
        assertEquals("aba", longestPalindrome.longestPalindrome("daba"));
    }
}
