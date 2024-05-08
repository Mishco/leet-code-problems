package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperPowTest {

    @Test
    void firstTest() {
        assertEquals(8, new SuperPow().superPow(2, new int[]{3}));
    }

    @Test
    void secondTest() {
        assertEquals(1024, new SuperPow().superPow(2, new int[]{1, 0}));
    }

    @Test
    void thirdTest() {
        assertEquals(1, new SuperPow().superPow(1, new int[]{4, 3, 3, 8, 5, 2}));
    }

    @Test
    void fourthTest() {
        int actual = new SuperPow().superPow(2147483647, new int[]{2, 0, 0});
        int expected = 1198;
        assertEquals(expected, actual);
    }

}