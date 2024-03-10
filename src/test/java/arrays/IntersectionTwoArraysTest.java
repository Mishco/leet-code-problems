package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTwoArraysTest {

    @Test
    void testOne() {
        int[] expected = {2};
        int[] actual = new IntersectionTwoArrays().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwo() {
        int[] expected = {4, 9};
        int[] actual = new IntersectionTwoArrays().intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        assertArrayEquals(expected, actual);
    }

}