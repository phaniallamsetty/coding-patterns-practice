package com.pallamsetty.trees;

/*
* Leetcode 226
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);

        return node;
    }
}
