package com.pallamsetty.trees;

import org.junit.Test;

import com.pallamsetty.trees.helpers.TreeNode;
import com.pallamsetty.trees.helpers.Assertions;

import static org.junit.Assert.assertEquals;

public class SerializeDeserializeBinaryTreeTest {
    private final SerializeDeserializeBinaryTree sdbt;

    public SerializeDeserializeBinaryTreeTest() {
        sdbt = new SerializeDeserializeBinaryTree();
    }

    @Test
    public void testSerializeDeserialize1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String expected = "1,2,N,N,3,4,N,N,5,N,N";

        String actual = sdbt.serialize(root);

        assertEquals(expected, actual);
    }

    @Test
    public void testSerializeDeserialize2() {
        TreeNode root = null;
        assertEquals("N", sdbt.serialize(root));
    }

    @Test
    public void testSerializeDeserialize3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Assertions.assertBinaryTrees(root, sdbt.deserialize(sdbt.serialize(root)));
    }

    @Test
    public void testSerializeDeserialize4() {
        TreeNode root = new TreeNode(1);

        String expected = "1,N,N";
        String actual = sdbt.serialize(root);

        assertEquals(expected, actual);

        TreeNode expectedDeserialize = new TreeNode(1);
        TreeNode actualDeserialize = sdbt.deserialize("1,N,N");

        Assertions.assertBinaryTrees(expectedDeserialize, actualDeserialize);
    }
}