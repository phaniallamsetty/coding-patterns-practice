package com.pallamsetty.stack;

/*
* Leetcode 150
* */

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            String current = tokens[i];
            int stackEl = Integer.MAX_VALUE;
            if(current.equals("+")
            || current.equals("-")
            || current.equals("*")
            || current.equals("/")) {
                stackEl = performOperation(stack, current);
            } else {
                stackEl = Integer.parseInt(current);
            }
            stack.push(stackEl);
        }
        return stack.peek();
    }

    private int performOperation(Stack<Integer> stack, String current) {
        int result = 0;
        int op1 = stack.pop();
        int op2 = stack.pop();

        switch (current) {
            case "+":
                result = op2 + op1;
                break;
            case "-":
                result = op2 - op1;
                break;
            case "*":
                result = op2 * op1;
                break;
            case "/":
                result = op2 / op1;
                break;
        }

        return result;
    }
}
