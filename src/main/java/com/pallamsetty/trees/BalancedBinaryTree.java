package com.pallamsetty.trees;

/*
* Leetcode 110
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {

        return false;
    }

    public int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);
        //boolean balance = Math.abs(left[1] - right[1]);
        return 0;
    }
}
