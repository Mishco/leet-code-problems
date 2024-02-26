package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void testArrays() {
        var strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(strs));
    }

    @Test
    void testSecondArray() {
        var strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", new LongestCommonPrefix().longestCommonPrefix(strs));
    }

}