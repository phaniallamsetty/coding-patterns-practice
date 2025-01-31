package com.pallamsetty.trees;

/*
* Leetcode 297
* */

import com.pallamsetty.trees.helpers.TreeNode;

public class SerializeDeserializeBinaryTree {
    private static int index;
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeDfs(root, sb);
        if(sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        String[] dataArr = data.split(",");
        return processArray(dataArr);
    }

    private void serializeDfs(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append("N");
            sb.append(",");
            return;
        }

        sb.append(root.val);
        sb.append(",");
        serializeDfs(root.left, sb);
        serializeDfs(root.right, sb);
    }

    private TreeNode processArray(String[] dataArr) {
        if(index >= dataArr.length || dataArr[index].equals("N")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(dataArr[index++]));
        root.left = processArray(dataArr);
        root.right = processArray(dataArr);

        return root;
    }
}
