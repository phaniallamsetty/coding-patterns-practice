package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiameterOfBinaryTreeTest {
    private final DiameterOfBinaryTree dbt;

    public DiameterOfBinaryTreeTest() {
        dbt = new DiameterOfBinaryTree();
    }

    @Test
    public void testGetDiameterOfBinaryTree1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        assertEquals(3, dbt.getDiameterOfBinaryTree(root));
    }

    @Test
    public void testGetDiameterOfBinaryTree2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        assertEquals(1, dbt.getDiameterOfBinaryTree(root));
    }

    @Test
    public void testGetDiameterOfBinaryTree3() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.left.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

        assertEquals(3, dbt.getDiameterOfBinaryTree(root));
    }

    @Test
    public void testGetDiameterOfBinaryTree4() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        assertEquals(2, dbt.getDiameterOfBinaryTree(root));
    }
}
