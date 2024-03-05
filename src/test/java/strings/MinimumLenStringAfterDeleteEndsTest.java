package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumLenStringAfterDeleteEndsTest {


    @Test
    void testOne() {
        assertEquals(2, new MinimumLenStringAfterDeleteEnds().minimumLength("ca"));
    }

    @Test
    void testTwo() {
        assertEquals(0, new MinimumLenStringAfterDeleteEnds().minimumLength("cabaabac"));
    }

    @Test
    void testThree() {
        assertEquals(3, new MinimumLenStringAfterDeleteEnds().minimumLength("aabccabba"));
    }

    @Test
    void failingTest() {
        assertEquals(1, new MinimumLenStringAfterDeleteEnds().minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"));
    }
}