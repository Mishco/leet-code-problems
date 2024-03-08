package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountElementsTest {


    @Test
    void testOne() {
        var nums = new int[]{1, 2, 2, 3, 1, 4};
        var expected = 4;
        assertEquals(expected, new CountElements().maxFrequencyElements(nums));
    }

    @Test
    void testTwo() {
        var nums = new int[]{1, 2, 3, 4, 5};
        var expected = 5;
        assertEquals(expected, new CountElements().maxFrequencyElements(nums));
    }

}