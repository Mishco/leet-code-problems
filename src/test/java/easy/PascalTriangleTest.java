package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalTriangleTest {


    @Test
    void testOne() {
        var actual = new PascalTriangle().generate(5);
        var expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));

        assertEquals(expected, actual);
    }

    @Test
    void testTwo() {
        var actual = new PascalTriangle().generate(1);
        var expected = List.of(List.of(1));

        assertEquals(expected, actual);
    }
}