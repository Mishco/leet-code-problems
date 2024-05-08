package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPowTest {

    @Test
    void oneExample() {
        assertEquals(1024.00,new MyPow().myPow(2.000, 10));
    }

    @Test
    void twoExample() {
        assertEquals(9.26100,new MyPow().myPow(2.100, 3));
    }


    @Test
    void thirdExample() {
        assertEquals(0.25000, new MyPow().myPow(2.000, -2));
    }

    @Test
    void failingTest() {
        assertEquals(700.28148,new MyPow().myPow(8.88023, 3));
    }

}