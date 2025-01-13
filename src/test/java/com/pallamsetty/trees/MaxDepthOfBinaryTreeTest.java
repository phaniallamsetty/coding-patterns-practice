package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDepthOfBinaryTreeTest {
    private final MaxDepthOfBinaryTree mdobtt;

    public MaxDepthOfBinaryTreeTest() {
        mdobtt = new MaxDepthOfBinaryTree();
    }

    @Test
    public void testGetMaxDepth1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);

        assertEquals(3, mdobtt.getMaxDepth(root));
    }

    @Test
    public void testGetMaxDepth2() {
        TreeNode root = null;

        assertEquals(0, mdobtt.getMaxDepth(root));
    }

    @Test
    public void testGetMaxDepth3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(3, mdobtt.getMaxDepth(root));
    }

    @Test
    public void testGetMaxDepth4() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        assertEquals(2, mdobtt.getMaxDepth(root));
    }
}
