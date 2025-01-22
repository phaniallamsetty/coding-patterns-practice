package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubtreeOfAntoherTreeTest {
    private final SubtreeOfAnotherTree soat;

    public SubtreeOfAntoherTreeTest() {
        soat = new SubtreeOfAnotherTree();
    }

    @Test
    public void testIsSubtree1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        assertTrue(soat.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtree2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(6);
        root.left.right = new TreeNode(5);

        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        assertFalse(soat.isSubtree(root, subRoot));
    }
}
