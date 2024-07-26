package vincent.leetcode.twoSumList;

/**
 * LeetCode #2
 */
public class TwoSumList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode tail = resultNode; // using the extra node for moving
        int carryOn = 0;
        while (l1 != null || l2 != null || carryOn > 0) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carryOn;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carryOn = sum / 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return resultNode.next;
    }
}





