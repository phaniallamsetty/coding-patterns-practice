package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodNodesBinaryTreeTest {
    private final GoodNodesBinaryTree gnbt;

    public GoodNodesBinaryTreeTest() {
        gnbt = new GoodNodesBinaryTree();
    }

    @Test
    public void testGetGoodNodesCount1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        assertEquals(3, gnbt.getGoodNodesCount(root));
    }

    @Test
    public void testGetGoodNodesCount2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(-1);

        assertEquals(4, gnbt.getGoodNodesCount(root));
    }

    @Test
    public void testGetGoodNodesCount3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        assertEquals(3, gnbt.getGoodNodesCount(root));
    }
}
