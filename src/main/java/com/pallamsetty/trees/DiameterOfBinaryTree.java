package com.pallamsetty.trees;

/*
* Leetcode 543
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class DiameterOfBinaryTree {
    public int getDiameterOfBinaryTree(TreeNode root) {
        int[] result = new int[1];
        dfs(root, result);
        return result[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if(root == null) {
            return 0;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
}
