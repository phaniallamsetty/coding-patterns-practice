package com.pallamsetty.trees;

/*
* Leetcode 98
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class ValidBST {
    public boolean isValidBST(TreeNode root){
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long left, long right) {
        if(root == null) {
            return true;
        }

        if(!(left < root.val && right > root.val)) {
            return false;
        }

        return isValidBST(root.left, left, root.val)
                && isValidBST(root.right, root.val, right);
    }
}
