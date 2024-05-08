package medium;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulTowersITest {

    @Test
    void exampleOne() {
        var lll = new ArrayList<Integer>();
        lll.add(5);
        lll.add(3);
        lll.add(4);
        lll.add(1);
        lll.add(1);
        assertEquals(13, new BeautifulTowersI().maximumSumOfHeights(lll));
    }

    @Test
    void exampleTwo() {
        var arr = new ArrayList<Integer>();
        arr.add(6);
        arr.add(5);
        arr.add(3);
        arr.add(9);
        arr.add(2);
        arr.add(7);
        assertEquals(22, new BeautifulTowersI().maximumSumOfHeights(arr));
    }

    @Test
    void failingTest() {
        List<Integer> maxHeights = Arrays.asList(3,6,3,5,5,1,2,5,5,6);
        assertEquals(24, new BeautifulTowersI().maximumSumOfHeights(maxHeights));
    }
}