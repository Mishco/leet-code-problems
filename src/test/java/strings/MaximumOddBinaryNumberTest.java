package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {

    @Test
    void testFirst() {
        assertEquals("001", new MaximumOddBinaryNumber().maximumOddBinaryNumber("010"));
    }

    @Test
    void testSecond() {
        assertEquals("1001", new MaximumOddBinaryNumber().maximumOddBinaryNumber("0101"));
    }
}