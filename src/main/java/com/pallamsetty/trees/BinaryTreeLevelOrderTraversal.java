package com.pallamsetty.trees;

/*
* Leetcode 102
* */

import com.pallamsetty.trees.helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> getLevelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> levelOrderList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for(int i = 0 ; i < size; i++) {
                TreeNode current = queue.poll();
                levelList.add(current.val);

                if(current.left != null) {
                    queue.offer(current.left);
                }

                if(current.right != null) {
                    queue.offer(current.right);
                }
            }

            levelOrderList.add(levelList);
        }

        return levelOrderList;
    }
}
