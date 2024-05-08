package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortStringTest {

    @Test
    void testOne() {
        assertEquals("cbad", new CustomSortString().customSortString("cba", "abcd"));
    }

    @Test
    void testTwo() {
        assertEquals("bcad", new CustomSortString().customSortString("bcafg", "abcd"));
    }
}