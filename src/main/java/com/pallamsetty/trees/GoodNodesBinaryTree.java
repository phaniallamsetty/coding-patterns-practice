package com.pallamsetty.trees;

/*
* Leetcode 1448
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class GoodNodesBinaryTree {
    public int getGoodNodesCount(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + getGoodNodesCount(root.left, root.val)
                + getGoodNodesCount(root.right, root.val);
    }

    private int getGoodNodesCount(TreeNode root, int currentMaxInPath) {
        if(root == null) {
            return 0;
        }

        int sum = 0;
        if(root.val >= currentMaxInPath) {
            currentMaxInPath = root.val;
            sum = 1;
        }

        return sum
                + getGoodNodesCount(root.left, currentMaxInPath)
                + getGoodNodesCount(root.right, currentMaxInPath);
    }
}
