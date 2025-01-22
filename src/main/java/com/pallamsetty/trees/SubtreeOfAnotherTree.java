package com.pallamsetty.trees;

/*
* Leetcode 572
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) {
            return true;
        }

        if(root == null) {
            return false;
        }

        SameBinaryTree sbt = new SameBinaryTree();
        if(sbt.isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
