package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidBSTTest {
    private final ValidBST vb;

    public ValidBSTTest() {
        vb = new ValidBST();
    }

    @Test
    public void testIsValidBST1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assertTrue(vb.isValidBST(root));
    }

    @Test
    public void testIsValidBST2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertFalse(vb.isValidBST(root));
    }

    @Test
    public void testIsValidBST3() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        assertFalse(vb.isValidBST(root));
    }

    @Test
    public void testIsValidBST4() {
        TreeNode root = new TreeNode(2147483647);

        assertTrue(vb.isValidBST(root));
    }
}
