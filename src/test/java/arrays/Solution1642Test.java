package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1642Test {

    @Test
    void test() {
        assertEquals(7, new Solution1642().furthestBuilding(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2));
    }

    @Test
    void sampleTest() {
//        Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
        assertEquals(4, new Solution1642().furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1));

    }

    @Test
    void testWithoutLadders() {
//        Input: heights = [14,3,19,3], bricks = 17, ladders = 0
        assertEquals(3, new Solution1642().furthestBuilding(new int[]{14, 3, 19, 3}, 17, 0));

    }
}