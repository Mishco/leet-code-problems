package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyPowTest {

    @Test
    void oneExample() {
        assertEquals(1024.00, new MyPow().myPow(2.000, 10));
    }

    @Test
    void twoExample() {
        double value = new MyPow().myPow(2.100, 3);
        value = Math.round(value * 1000.00);
        value = value / 1000.00;
        assertEquals(9.26100, value);
    }


    @Test
    void thirdExample() {
        assertEquals(0.25000, new MyPow().myPow(2.000, -2));
    }

    @Test
    void failingTest() {
        double value = new MyPow().myPow(8.88023, 3);
        value = Math.round(value * 100000.00);
        value = value / 100000.00;

        assertEquals(700.28148, value);
    }

}