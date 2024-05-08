package medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulTowersIITest {

    @Test
    void exampleOne() {
        List<Integer> maxHeights = Arrays.asList(5, 3, 4, 1, 1);
        assertEquals(13, new BeautifulTowersII().maximumSumOfHeights(maxHeights));
    }

    @Test
    void exampleTwo() {
        List<Integer> maxHeights = Arrays.asList(6, 5, 3, 9, 2, 7);
        assertEquals(22, new BeautifulTowersII().maximumSumOfHeights(maxHeights));
    }

    @Test
    void exampleThree() {
        List<Integer> maxHeights = Arrays.asList(3, 2, 5, 5, 2, 3);
        assertEquals(18, new BeautifulTowersII().maximumSumOfHeights(maxHeights));
    }

}