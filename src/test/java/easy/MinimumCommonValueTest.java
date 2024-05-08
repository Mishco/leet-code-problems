package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {

    @Test
    void testOne() {
        assertEquals(2,new MinimumCommonValue().getCommon(new int[]{1,2,3}, new int[]{2,4}));
    }
    @Test
    void testTwo() {
        assertEquals(2,new MinimumCommonValue().getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }

}