package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.Assertions;
import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class InvertBinaryTreeTest {
    private final InvertBinaryTree ibt;

    public InvertBinaryTreeTest() {
        ibt = new InvertBinaryTree();
    }

    @Test
    public void testInvertTree1() {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.left.left = new TreeNode(9);
        expected.left.right = new TreeNode(6);

        expected.right = new TreeNode(2);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        TreeNode actual = ibt.invertTree(root);

        Assertions.assertBinaryTrees(expected, actual);
    }

    @Test
    public void testInvertTree2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode expected = new TreeNode(2);
        expected.left = new TreeNode(3);

        expected.right = new TreeNode(1);

        TreeNode actual = ibt.invertTree(root);

        Assertions.assertBinaryTrees(expected, actual);
    }

    @Test
    public void testInvertTree3() {
        assertNull(ibt.invertTree(null));
    }
}
