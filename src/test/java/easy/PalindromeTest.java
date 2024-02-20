package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    void sameTest() {
        assertTrue(new Palindrome().isPalindrome(121));
    }

    @Test
    void anotherTest() {
        assertFalse(new Palindrome().isPalindrome(-121));
    }

    @Test
    void smallTest() {
        assertFalse(new Palindrome().isPalindrome(10));
    }
}