package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIntegerTest {

    @Test
    void testOne() {
        assertEquals(6,new PivotInteger2485().pivotInteger(8));
    }

    @Test
    void testTwo() {
        assertEquals(1,new PivotInteger2485().pivotInteger(1));
    }

    @Test
    void testThird() {
        assertEquals(-1,new PivotInteger2485().pivotInteger(4));
    }
}