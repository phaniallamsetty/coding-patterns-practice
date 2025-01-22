package com.pallamsetty.trees;

/*
* Leetcode 110
* */

import com.pallamsetty.trees.helpers.Pair;
import com.pallamsetty.trees.helpers.TreeNode;

public class BalancedBinaryTree {
    public boolean isTreeBalanced(TreeNode root) {
        return dfs(root).getFirst();
    }

    public Pair<Boolean, Integer> dfs(TreeNode root) {
        if(root == null) {
            return new Pair(true, 0);
        }

        Pair<Boolean, Integer> left = dfs(root.left);
        Pair<Boolean, Integer> right = dfs(root.right);

        boolean isBalanced = left.getFirst()
                && right.getFirst()
                && Math.abs(left.getSecond() - right.getSecond()) <= 1;
        return new Pair<>(isBalanced,
                1 + Math.max(left.getSecond(), right.getSecond()));
    }
}
