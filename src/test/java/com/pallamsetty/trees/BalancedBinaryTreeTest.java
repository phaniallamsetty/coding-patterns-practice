package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBinaryTreeTest {
    private final BalancedBinaryTree bbt;

    public BalancedBinaryTreeTest() {
        bbt = new BalancedBinaryTree();
    }

    @Test
    public void testIsTreeBalanced1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);

        assertTrue(bbt.isTreeBalanced(root));
    }

    @Test
    public void testIsTreeBalanced2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);

        assertFalse(bbt.isTreeBalanced(root));
    }

    @Test
    public void testIsTreeBalanced3() {
        TreeNode root = new TreeNode();
        assertTrue(bbt.isTreeBalanced(root));
    }

    @Test
    public void testIsTreeBalanced4() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(bbt.isTreeBalanced(root));
    }

    @Test
    public void testIsTreeBalanced5() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        root.right = new TreeNode(2);;
        assertFalse(bbt.isTreeBalanced(root));
    }
}
