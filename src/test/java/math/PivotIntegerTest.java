package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIntegerTest {

    @Test
    void testOne() {
        assertEquals(6,new PivotInteger().pivotInteger(8));
    }

    @Test
    void testTwo() {
        assertEquals(1,new PivotInteger().pivotInteger(1));
    }

    @Test
    void testThird() {
        assertEquals(-1,new PivotInteger().pivotInteger(4));
    }
}