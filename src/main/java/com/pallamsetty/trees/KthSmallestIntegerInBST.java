package com.pallamsetty.trees;

/*
*
* */

import com.pallamsetty.trees.helpers.TreeNode;

import java.util.Stack;

public class KthSmallestIntegerInBST {
    public int getKthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            k--;
            if(k == 0) {
                return current.val;
            }

            current = current.right;
        }

        return -1;
    }
}
