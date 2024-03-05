package strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonCharactersTest {

    @Test
    void oneExample() {
        assertEquals(Arrays.asList("e", "l", "l"), new FindCommonCharacters().commonChars(new String[]{"bella", "label", "roller"}));
    }

    @Test
    void twoExample() {
        assertEquals(Arrays.asList("c", "o"), new FindCommonCharacters().commonChars(new String[]{"cool", "lock", "cook"}));
    }

}