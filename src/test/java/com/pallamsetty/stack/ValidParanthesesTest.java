package com.pallamsetty.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParanthesesTest {
    private final ValidParantheses vp;

    public ValidParanthesesTest() {
        vp = new ValidParantheses();
    }

    @Test
    public void testIsValid1() {
        String s = "()";
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid2() {
        String s = "()[]{}";
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid3() {
        String s = "(]";
        assertFalse(vp.isValid(s));
    }

    @Test
    public void testIsValid4() {
        String s = "([])";
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid5() {
        String s = "[]";
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid6() {
        String s = "([{}])";
        assertTrue(vp.isValid(s));
    }

    @Test
    public void testIsValid7() {
        String s = "[(])";
        assertFalse(vp.isValid(s));
    }

    @Test
    public void testIsValid8() {
        String s = "]";
        assertFalse(vp.isValid(s));
    }
}
