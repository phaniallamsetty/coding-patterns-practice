package com.pallamsetty.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    private final Palindrome palindrome;

    public PalindromeTest() {
        palindrome = new Palindrome();
    }

    @Test
    public void testIsPalindrome1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(palindrome.isPalindrome(s));
    }

    @Test
    public void testIsPalindrome2() {
        String s = "race a car";
        assertFalse(palindrome.isPalindrome(s));
    }

    @Test
    public void testIsPalindrome3() {
        String s = " ";
        assertTrue(palindrome.isPalindrome(s));
    }

    @Test
    public void testIsPalindrome4() {
        String s = "a";
        assertTrue(palindrome.isPalindrome(s));
    }
}
