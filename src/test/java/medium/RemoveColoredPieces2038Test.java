package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveColoredPieces2038Test {

    @Test
    void firstExampleTest()  {
        assertTrue(new RemoveColoredPieces2038().winnerOfGame("AAABABB"));
    }

    @Test
    void secondExampleTest()  {
        assertFalse(new RemoveColoredPieces2038().winnerOfGame("AA"));
    }

    @Test
    void thirdExampleTest(){
        assertFalse(new RemoveColoredPieces2038().winnerOfGame("ABBBBBBBAAA"));
    }
}