package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1481Test {

    @Test
    void testFirst() {
        assertNotEquals(0, new Solution1481().findLeastNumOfUniqueInts(new int[]{5, 5, 4}, 1));
    }

    @Test
    void testSampleFirst() {
        assertEquals(1, new Solution1481().findLeastNumOfUniqueInts(new int[]{5, 5, 4}, 1));
    }

    @Test
    void testSampleSecond() {
        assertEquals(2, new Solution1481().findLeastNumOfUniqueInts(new int[]{4, 3, 1, 1, 3, 3, 2}, 3));
    }

}