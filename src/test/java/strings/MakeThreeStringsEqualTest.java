package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeThreeStringsEqualTest {


    @Test
    void oneExample() {
        assertEquals(2, new MakeThreeStringsEqual().findMinimumOperations("abc", "abb", "ab"));
    }

    @Test
    void twoExample() {
        assertEquals(-1, new MakeThreeStringsEqual().findMinimumOperations("dac", "bac", "cac"));
    }

    @Test
    void failingTest() {
        assertEquals(0, new MakeThreeStringsEqual().findMinimumOperations("a", "a", "a"));
    }

    @Test
    void failingTestSecond() {
        assertEquals(-1, new MakeThreeStringsEqual().findMinimumOperations("kui","m", "v"));

    }
}