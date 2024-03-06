package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionTwoArraysIITest {


    @Test
    void exampleOne() {
        int[] expected = {2, 2};
        int[] actual = new IntersectionTwoArraysII().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        Arrays.sort(expected);
        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    void exampleTwo() {
        int[] expected = {4, 9};
        int[] actual = new IntersectionTwoArraysII().intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }
}