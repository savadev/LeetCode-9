package leetcode.helpers;


public class ListNode implements Comparable<ListNode> {
    public int val;
    public ListNode next = null;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + (next == null ? "" : ", " + next.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListNode)) {
            return false;
        } else {
            ListNode other = (ListNode) obj;
            return toString().equals(other.toString());
        }
    }

    @Override
    public int compareTo(ListNode other) {
        return val - other.val;
    }
}
