package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.Assertions;
import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

public class LowestCommonAncestorBSTTest {
    private final LowestCommonAncestorBST lcabst;
    private final TreeNode root;

    public LowestCommonAncestorBSTTest() {
        lcabst = new LowestCommonAncestorBST();
        root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
    }

    @Test
    public void testGetLowestCommonAncestor1() {
        TreeNode p = new TreeNode(2);
        p.left = new TreeNode(0);
        p.right = new TreeNode(4);
        p.right.left = new TreeNode(3);
        p.right.right = new TreeNode(5);

        TreeNode q = new TreeNode(8);
        q.left = new TreeNode(7);
        q.right = new TreeNode(9);

        TreeNode expected = root;

        TreeNode actual = lcabst.getLowestCommonAncestor(root, p, q);

        Assertions.assertBinaryTrees(expected, actual);
    }

    @Test
    public void testGetLowestCommonAncestor2() {
        TreeNode p = new TreeNode(2);
        p.left = new TreeNode(0);
        p.right = new TreeNode(4);
        p.right.left = new TreeNode(3);
        p.right.right = new TreeNode(5);

        TreeNode q = new TreeNode(4);
        q.left = new TreeNode(3);
        q.right = new TreeNode(5);

        TreeNode expected = p;

        TreeNode actual = lcabst.getLowestCommonAncestor(root, p, q);

        Assertions.assertBinaryTrees(expected, actual);
    }
}
