package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution201Test {

    @ParameterizedTest
    @CsvSource({
            "5, 7, 4",
            "0, 0, 0",
            "1, 2147483647, 0"
    })
    void testRangeBitwiseAnd(int m, int n, int expected) {
        assertEquals(expected, new Solution201().rangeBitwiseAnd(m, n));
    }
}