package com.pallamsetty.trees;

/*
* Leetcode 124
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class BinaryTreeMaxPathSum {
    public int getMaxSum(TreeNode root) {
        int[] res = new int[] { root.val };

        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if(root == null) {
            return 0;
        }

        int leftMax = Math.max(dfs(root.left, res), 0);
        int rightMax = Math.max(dfs(root.right, res), 0);

        res[0] = Math.max(res[0], root.val + leftMax + rightMax);
        return root.val + Math.max(leftMax, rightMax);
    }
}
