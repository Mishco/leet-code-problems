package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindWordsContainingCharTest {

    @Test
    void exampleOne() {
        assertEquals(Arrays.asList(0, 1), new FindWordsContainingChar().findWordsContaining(new String[]{"leet", "code"}, 'e'));
    }

}