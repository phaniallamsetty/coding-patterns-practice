package com.pallamsetty.linkedlist;

/*
* Leetcode 138
* */

import com.pallamsetty.linkedlist.helpers.NodeWithRandom;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public NodeWithRandom copyRandomList(NodeWithRandom head) {
        HashMap<NodeWithRandom, NodeWithRandom> copyMap = new HashMap<>();
        copyMap.put(null, null);

        NodeWithRandom current = head;

        while(current != null) {
            copyMap.put(current, new NodeWithRandom(current.val));
            current = current.next;
        }

        current = head;
        while(current != null) {
            NodeWithRandom copyNode = copyMap.get(current);
            copyNode.next = copyMap.get(current.next);
            copyNode.random = copyMap.get(current.random);
            current = current.next;
        }
        return copyMap.get(head);
    }
}
