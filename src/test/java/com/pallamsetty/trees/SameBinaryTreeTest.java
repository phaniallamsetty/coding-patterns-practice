package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameBinaryTreeTest {
    private final SameBinaryTree sbt;

    public SameBinaryTreeTest() {
        sbt = new SameBinaryTree();
    }

    @Test
    public void testIsSameTree1() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        assertTrue(sbt.isSameTree(p, q));
    }

    @Test
    public void testIsSameTree2() {
        TreeNode p = new TreeNode(4);
        p.left = new TreeNode(7);

        TreeNode q = new TreeNode(4);
        q.right = new TreeNode(7);

        assertFalse(sbt.isSameTree(p, q));
    }

    @Test
    public void testIsSameTree3() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(3);
        q.right = new TreeNode(2);

        assertFalse(sbt.isSameTree(p, q));
    }
}
