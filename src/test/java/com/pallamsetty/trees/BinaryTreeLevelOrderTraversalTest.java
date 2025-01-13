package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {
    private final BinaryTreeLevelOrderTraversal btlot;

    public BinaryTreeLevelOrderTraversalTest() {
        btlot = new BinaryTreeLevelOrderTraversal();
    }

    @Test
    public void testGetLevelOrder1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new Integer[]{1}));
        expected.add(Arrays.asList(new Integer[]{2, 3}));
        expected.add(Arrays.asList(new Integer[]{4, 5, 6, 7,}));

        List<List<Integer>> actual = btlot.getLevelOrder(root);
        assertNestedListEquals(expected, actual);
    }

    @Test
    public void testGetLevelOrder2() {
        TreeNode root = new TreeNode(1);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new Integer[]{1}));

        List<List<Integer>> actual = btlot.getLevelOrder(root);
        assertNestedListEquals(expected, actual);
    }

    @Test
    public void testGetLevelOrder3() {
        TreeNode root = null;

        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> actual = btlot.getLevelOrder(root);
        assertNestedListEquals(expected, actual);
    }

    @Test
    public void testGetLevelOrder4() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new Integer[]{3}));
        expected.add(Arrays.asList(new Integer[]{9, 20}));
        expected.add(Arrays.asList(new Integer[]{15, 7}));

        List<List<Integer>> actual = btlot.getLevelOrder(root);
        assertNestedListEquals(expected, actual);
    }

    private void assertNestedListEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());

        for(int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.toArray(), actual.toArray());
        }
    }
}
