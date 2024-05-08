package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void oneSample() {
        ListNode ln = new ListNode(3);
        assertFalse(new LinkedListCycle().hasCycle(ln));
    }

}