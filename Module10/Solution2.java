package Module10;
//2 LeetCode 141 – Linked List Cycle (Easy
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;        // move 1 step
            fast = fast.next.next;   // move 2 steps

            if (slow == fast) {
                return true;         // cycle found
            }
        }

        return false;                // no cycle
    }
}
