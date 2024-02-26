package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    void simpleTest() {
        assertTrue(new ValidParentheses().isValid("{}"));
    }

    @Test
    void simpleSecondTest() {
        assertTrue(new ValidParentheses().isValid("[]"));
    }

    @Test
    void simpleThirdTest() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    @Test
    void difficultTest() {
        assertTrue(new ValidParentheses().isValid("[({})]"));
    }

    @Test
    void notValid() {
        assertFalse(new ValidParentheses().isValid("[({"));
    }

    @Test
    void passedTest() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }

    @Test
    void falseTest() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }

    @Test
    void failingTest() {
        assertFalse(new ValidParentheses().isValid("([)]"));
    }

}