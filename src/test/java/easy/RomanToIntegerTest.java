package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void testSimple() {
        assertEquals(3, new RomanToInteger().romanToInt("III"));
    }

    @Test
    void testSecondSimple() {
        assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
    }

    @Test
    void longerTest() {
        assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
    }

}