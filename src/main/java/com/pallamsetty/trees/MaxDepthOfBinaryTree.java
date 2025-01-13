package com.pallamsetty.trees;

/*
* Leetcode 104
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class MaxDepthOfBinaryTree {
    public int getMaxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(
                getMaxDepth(root.left),
                getMaxDepth(root.right)
        );
    }
}
