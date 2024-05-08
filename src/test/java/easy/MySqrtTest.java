package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqrtTest {

    @Test
    void oneSample() {
        assertEquals(2,new MySqrt().mySqrt(4));
    }


    @Test
    void twoSample() {
        assertEquals(0,new MySqrt().mySqrt(0));
    }

    @Test
    void thirdSample() {
        assertEquals(2,new MySqrt().mySqrt(8));
    }


}