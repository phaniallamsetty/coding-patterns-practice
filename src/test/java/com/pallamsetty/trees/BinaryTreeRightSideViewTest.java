package com.pallamsetty.trees;

import com.pallamsetty.trees.helpers.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeRightSideViewTest {
    private final BinaryTreeRightSideView btrsv;

    public BinaryTreeRightSideViewTest() {
        btrsv = new BinaryTreeRightSideView();
    }

    @Test
    public void testGetRightSideView1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<Integer> expected = Arrays.asList(new Integer[] {1, 3});
        List<Integer> actual = btrsv.getRightSideView(root);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testGetRightSideView2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> expected = Arrays.asList(new Integer[] {1, 3, 7});
        List<Integer> actual = btrsv.getRightSideView(root);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testGetRightSideView3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        List<Integer> expected = Arrays.asList(new Integer[] {1, 3, 4});
        List<Integer> actual = btrsv.getRightSideView(root);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testGetRightSideView4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.left.left = new TreeNode(5);

        List<Integer> expected = Arrays.asList(new Integer[] {1, 3, 4, 5});
        List<Integer> actual = btrsv.getRightSideView(root);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testGetRightSideView5() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);

        List<Integer> expected = Arrays.asList(new Integer[] {1, 3});
        List<Integer> actual = btrsv.getRightSideView(root);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testGetRightSideView6() {
        TreeNode root = null;

        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = btrsv.getRightSideView(root);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
