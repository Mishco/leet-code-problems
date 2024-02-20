package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution268Test {

    @Test
    void test() {
//        Input: nums = [3,0,1]
//        Output: 2
        assertEquals(2, new Solution268().missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void testSecond() {
//        Input: nums = [0,1]
//        Output: 2
        assertEquals(2, new Solution268().missingNumber(new int[]{0, 1}));
    }


    @Test
    void testThird() {
        assertEquals(8, new Solution268().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}