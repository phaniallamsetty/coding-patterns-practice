package com.pallamsetty.trees;

/*
* Leetcode 235
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class LowestCommonAncestorBST {
    public TreeNode getLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val > p.val && root.val < q.val) ||
                (root.val == p.val || root.val == q.val)) {
            return root;
        }

        if(p.val < root.val && q.val < root.val) {
            return getLowestCommonAncestor(root.left, p, q);
        }

        if(p.val > root.val && q.val > root.val) {
            return getLowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
