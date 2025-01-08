package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructBinaryTreeFromPreorderInorderTest {
    private final ConstructBinaryTreeFromPreorderInorder cbtfpi;

    public ConstructBinaryTreeFromPreorderInorderTest() {
        cbtfpi = new ConstructBinaryTreeFromPreorderInorder();
    }

    @Test
    public void testBuildTree1() {
        int[] preorderArr = { 5, 6, 8, 12, 13, 9, 7, 10, 11, 14, 16 };
        int[] inorderArr = { 12, 8, 13, 6, 9, 5, 10, 7, 14, 11, 16 };

        TreeNode expected = new TreeNode(5);

        expected.left = new TreeNode(6);
        expected.left.left = new TreeNode(8);
        expected.left.right = new TreeNode(9);
        expected.left.left.left = new TreeNode(12);
        expected.left.left.right = new TreeNode(13);

        expected.right = new TreeNode(7);
        expected.right.left = new TreeNode(10);
        expected.right.right = new TreeNode(11);
        expected.right.right.left = new TreeNode(14);
        expected.right.right.right = new TreeNode(16);

        TreeNode actual = cbtfpi.buildTree(preorderArr, inorderArr);

        assertTrees(expected, actual);
    }

    @Test
    public void testBuildTree2() {
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(9);
        expected.right = new TreeNode(20);
        expected.right.left = new TreeNode(15);
        expected.right.right = new TreeNode(7);

        TreeNode actual = cbtfpi.buildTree(preorder, inorder);
        assertTrees(expected, actual);
    }

    @Test
    public void testBuildTree3() {
        int[] preorder = { -1 };
        int[] inorder = { -1 };

        TreeNode expected = new TreeNode(-1);

        TreeNode actual = cbtfpi.buildTree(preorder, inorder);
        assertTrees(expected, actual);
    }

    @Test
    public void testBuildTree4() {
        int[] preorder = { 1, 2, 3, 4 };
        int[] inorder = { 2, 1, 3, 4 };

        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.right.right = new TreeNode(4);

        TreeNode actual = cbtfpi.buildTree(preorder, inorder);
        assertTrees(expected, actual);
    }

    private void assertTrees(TreeNode expected, TreeNode actual) {
        if(expected == null) {
            assertNull(actual);
        } else {
            assertEquals(expected.val, actual.val);
            assertTrees(expected.left, actual.left);
            assertTrees(expected.right, actual.right);
        }
    }
}
