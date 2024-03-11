package math;

import com.sun.jdi.ArrayReference;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleIITest {

    @Test
    void testOne() {
        List<Integer> row = new PascalTriangleII().getRow(3);
        List<Integer> excepted = Arrays.asList(1,3,3,1);
        assertEquals(row, excepted);
    }

    @Test
    void testTwo() {
        List<Integer> row = new PascalTriangleII().getRow(0);
        List<Integer> excepted = List.of(1);
        assertEquals(row, excepted);
    }
    @Test
    void testThird() {
        List<Integer> row = new PascalTriangleII().getRow(1);
        List<Integer> excepted = Arrays.asList(1,1);
        assertEquals(row, excepted);
    }
}