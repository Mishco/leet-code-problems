package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {

    @Test
    void test() {
        assertEquals( "s'teL ekat edoCteeL tsetnoc",new ReverseWordsInString().reverseWords("Let's take LeetCode contest"));
    }
    @Test
    void testSeconsd() {
        assertEquals( "rM gniD",new ReverseWordsInString().reverseWords("Mr Ding"));
    }
}