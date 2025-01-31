package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeMaxPathSumTest {
    private final BinaryTreeMaxPathSum btmps;

    public BinaryTreeMaxPathSumTest() {
        btmps = new BinaryTreeMaxPathSum();
    }

    @Test
    public void testGetMaxPathSum1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertEquals(6, btmps.getMaxSum(root));
    }

    @Test
    public void testGetMaxPathSum2() {
        TreeNode root = new TreeNode(-15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.left.left = new TreeNode(-5);
        root.right.right = new TreeNode(5);

        assertEquals(40, btmps.getMaxSum(root));
    }
}
