package com.pallamsetty.trees;

/*
 * Leetcode 105
 * */

import com.pallamsetty.trees.helpers.TreeNode;

import java.util.HashMap;

public class ConstructBinaryTreeFromPreorderInorder {
    int preIndex = 0;
    HashMap<Integer, Integer> indices = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            indices.put(inorder[i], i);
        }
        return dfs(preorder, 0, inorder.length - 1);
    }

    private TreeNode dfs(int[] preorder, int left, int right) {
        if(left > right) {
            return null;
        }

        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);
        int mid = indices.get(root.val);
        root.left = dfs(preorder, left, mid - 1);
        root.right = dfs(preorder, mid + 1, right);
        return root;
    }
}
