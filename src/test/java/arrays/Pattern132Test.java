package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pattern132Test {

    @Test
    void test() {
        assertFalse(new Pattern132().find132pattern(new int[]{1, 2, 3, 4}));
    }

    @Test
    void trueTest() {
        assertTrue(new Pattern132().find132pattern(new int[]{3, 1, 4, 2}));
    }

    @Test
    void multiplePattern() {
        assertTrue(new Pattern132().find132pattern(new int[]{-1, 3, 2, 0}));
    }

    @Test
    void failingTest() {
        assertTrue(new Pattern132().find132pattern(new int[]{3, 5, 0, 3, 4}));
    }

}