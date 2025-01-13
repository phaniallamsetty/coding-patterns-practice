package com.pallamsetty.trees.helpers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class Assertions {
    public static void assertBinaryTrees(TreeNode expected, TreeNode actual) {
        int expectedSize = getBinaryTreeSize(expected);
        int actualSize = getBinaryTreeSize(actual);

        assertEquals(expectedSize, actualSize);

        assertBinaryTreesInorder(expected, actual);
    }

    private static int getBinaryTreeSize(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int count = 0;
        count += getBinaryTreeSize(root.left);
        count++;
        count += getBinaryTreeSize(root.right);

        return count;
    }

    private static void assertBinaryTreesInorder(TreeNode expected, TreeNode actual) {
        if(expected == null || actual == null) {
            assertNull(expected);
            assertNull(actual);
            return;
        }

        assertBinaryTreesInorder(expected.left, actual.left);
        assertEquals(expected.val, actual.val);
        assertBinaryTreesInorder(expected.right, actual.right);
    }
}

