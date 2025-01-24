package com.pallamsetty.trees;

/*
* Leetcode 98
* */

import com.pallamsetty.trees.helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {
    public boolean isValidBST(TreeNode root){
        List<Integer> inorderList = new ArrayList<>();

        boolean isBST = true;
        inorderTraversal(root, inorderList);
        int prev = inorderList.get(0);

        for(int i = 1; i < inorderList.size(); i++) {
            if(inorderList.get(i) <= prev) {
                return false;
            }

            prev = inorderList.get(i);
        }

        return true;
    }

    private void inorderTraversal(TreeNode root, List<Integer> inorderList) {
        if(root == null) {
            return;
        }

        inorderTraversal(root.left, inorderList);
        inorderList.add(root.val);
        inorderTraversal(root.right, inorderList);
    }
}
