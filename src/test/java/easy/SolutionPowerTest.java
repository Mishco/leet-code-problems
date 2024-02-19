package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionPowerTest {

    @Test
    void testInvalid() {
        assertFalse(new SolutionPower().isPowerOfTwo(10));
    }

    @Test
    void testInvalidSecond() {
        assertFalse(new SolutionPower().isPowerOfTwo(3));
    }

    @Test
    void testValid() {
        assertTrue(new SolutionPower().isPowerOfTwo(16));
    }

    @Test
    void testValidBigger() {
        assertTrue(new SolutionPower().isPowerOfTwo(1024));
    }
}