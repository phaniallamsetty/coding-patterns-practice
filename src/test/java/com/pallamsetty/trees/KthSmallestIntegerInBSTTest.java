package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestIntegerInBSTTest {
    private final KthSmallestIntegerInBST ksiib;

    public KthSmallestIntegerInBSTTest() {
        ksiib = new KthSmallestIntegerInBST();
    }

    @Test
    public void testGetKthSmallest1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int k = 1;
        assertEquals(1, ksiib.getKthSmallest(root, k));
    }

    @Test
    public void testGetKthSmallest2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(5);
        int k = 4;
        assertEquals(5, ksiib.getKthSmallest(root, k));
    }

    @Test
    public void testGetKthSmallest3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        int k = 1;
        assertEquals(1, ksiib.getKthSmallest(root, k));
    }

    @Test
    public void testGetKthSmallest4() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        int k = 3;
        assertEquals(3, ksiib.getKthSmallest(root, k));
    }
}
