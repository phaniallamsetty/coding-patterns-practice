package com.pallamsetty.stack;

/*
* Leetcode 22
* */

import java.util.ArrayList;
import java.util.List;

public class ParanthesesGenerator {
    private ValidParantheses vp;

    public ParanthesesGenerator() {
        vp  = new ValidParantheses();
    }

    public List<String> generateParanthesesBruteForce(int n) {
        List<String> res = new ArrayList<>();
        dfs("", res, n);
        return res;
    }

    private void dfs(String s, List<String> res, int n) {
        if(2 * n == s.length()) {
            if(vp.isValid(s)) {
                res.add(s);
            }
            return;
        }

        dfs(s + '(', res, n);
        dfs(s + ')', res, n);
    }

    public List<String> generateParanthesesBacktracking(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, res, stack);
        return res;
    }

    private void backtrack(int openN, int closedN, int n, List<String> res,
                           StringBuilder stack) {
        if(openN == closedN && openN == n) {
            res.add(stack.toString());
            return;
        }

        if(openN < n) {
            stack.append('(');
            backtrack(openN + 1, closedN, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }

        if(closedN < openN) {
            stack.append(')');
            backtrack(openN, closedN + 1, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
