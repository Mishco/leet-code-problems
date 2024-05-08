package easy;

public class LinkedListMiddle {
    public ListNode middleNode(ListNode head) {
        var fast = head;
        var slow = fast;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
