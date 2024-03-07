package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListMiddleTest {

    @Test
    void oneTest() {
        assertNotNull(new LinkedListMiddle().middleNode(new ListNode(1)));
    }

}