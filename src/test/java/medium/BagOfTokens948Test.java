package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagOfTokens948Test {

    @Test
    void testOne() {
        assertEquals(0, new BagOfTokens948().bagOfTokensScore(new int[]{100}, 50));
    }

    @Test
    void testTwo() {
        assertEquals(1, new BagOfTokens948().bagOfTokensScore(new int[]{200,100}, 150));
    }

    @Test
    void testThree() {
        assertEquals(2, new BagOfTokens948().bagOfTokensScore(new int[]{100,200,300,400}, 200));

    }
}