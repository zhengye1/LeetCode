package vincent.leetcode.customAtoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomAtoiTest {
    CustomAtoi customAtoi = new CustomAtoi();

    @Test
    public void test1() {
        assertEquals(0, customAtoi.myAtoi("0-1"));
    }

    @Test
    public void test2() {
        assertEquals(-42, customAtoi.myAtoi("   -042"));
    }

    @Test
    public void test3() {
        assertEquals(1337, customAtoi.myAtoi("1337c0d3"));
    }

    @Test
    public void test4() {
        assertEquals(42, customAtoi.myAtoi("42"));
    }

    @Test
    public void test5() {
        assertEquals(0, customAtoi.myAtoi("words and 987"));
    }

    @Test
    public void test6() {
        assertEquals(-1, customAtoi.myAtoi("-1-1"));
    }

    @Test
    public void test7() {
        assertEquals(-2147483648, customAtoi.myAtoi("-91283472332"));
    }
}
