package com.pallamsetty.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversePolishNotationTest {
    private final ReversePolishNotation rpn;

    public ReversePolishNotationTest() {
        rpn = new ReversePolishNotation();
    }

    @Test
    public void testEvalRPN1() {
        String[] tokens = { "1", "2", "+", "3", "*", "4", "-" };
        assertEquals(5, rpn.evalRPN(tokens));
    }

    @Test
    public void testEvalRPN2() {
        String[] tokens = { "2", "1", "+", "3", "*" };
        assertEquals(9, rpn.evalRPN(tokens));
    }

    @Test
    public void testEvalRPN3() {
        String[] tokens = { "4", "13", "5", "/", "+" };
        assertEquals(6, rpn.evalRPN(tokens));
    }

    @Test
    public void testEvalRPN4() {
        String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        assertEquals(22, rpn.evalRPN(tokens));
    }
}
