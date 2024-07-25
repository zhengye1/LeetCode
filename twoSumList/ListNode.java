package vincent.leetcode.twoSumList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // generate the hashCode
    @Override
    public int hashCode() {

        int hash = 1;
        ListNode n = this;
        while (n != null) {
            hash = 31 * hash + n.val;
            n = n.next;
        }
        return hash;
    }

    @Override
    public boolean equals(Object node) {
        // compare two node and the child value also need to be same
        if (this == node)
            return true;
        if (node instanceof ListNode n2) {
            ListNode n1 = this;
            while (n1 != null && n2 != null) {
                if (n1.val != n2.val)
                    return false;
                n1 = n1.next;
                n2 = n2.next;
            }
            return true;
        }
        return false;
    }
}