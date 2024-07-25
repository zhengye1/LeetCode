package vincent.leetcode.twoSumList;

import org.junit.jupiter.api.Test;

public class TwoSumListTest {

    @Test
    public void testCase1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = new TwoSumList().addTwoNumbers(l1, l2);
        // 7 0 8 for the result
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assert (result.equals(expected));
    }

    @Test
    public void testCase2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode result = new TwoSumList().addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(0);
        assert (result.equals(expected));
    }

    @Test
    public void testCase3() {
        ListNode l1 = new ListNode(9,
            new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode result = new TwoSumList().addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(8, new ListNode(9,
            new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assert (result.equals(expected));
    }
}
