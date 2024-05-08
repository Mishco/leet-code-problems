package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution387Test {

    @Test
    void testFirstSample() {
        assertEquals(0, new Solution387().firstUniqChar("leetcode"));
    }

    @Test
    void testSecondSample() {
        assertEquals(2, new Solution387().firstUniqChar("loveleetcode"));
    }

    @Test
    void testThirdSample() {
        assertEquals(-1, new Solution387().firstUniqChar("aabb"));
    }
}