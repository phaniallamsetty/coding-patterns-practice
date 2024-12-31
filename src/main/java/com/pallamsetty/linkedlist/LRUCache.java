package com.pallamsetty.linkedlist;

import com.pallamsetty.linkedlist.helpers.ListNodeNullable;

import java.util.HashMap;

public class LRUCache {
    private int capacity;
    private HashMap<Integer, ListNodeNullable> cache;
    private ListNodeNullable head;
    private ListNodeNullable tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer, ListNodeNullable>();
        head = new ListNodeNullable();
        tail = new ListNodeNullable();
        head.next = tail;
        tail.previous = head;
    }

    public int get(int key) {
        ListNodeNullable node = cache.get(key);

        if(node == null) {
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        ListNodeNullable node = cache.get(key);

        if(node == null) {
            //The key does not exist currently in the cache
            ListNodeNullable newNode = new ListNodeNullable();
            newNode.key = key;
            newNode.value = value;

            addNodeToHead(newNode);
            cache.put(newNode.key, newNode);

            if(cache.size() > capacity) {
                ListNodeNullable tail = removeTail();
                cache.remove(tail.key);
            }
        } else {
            node.value = value;
            cache.put(key, node);
            moveToHead(node);
        }
    }

    private void moveToHead(ListNodeNullable node) {
        removeNode(node);
        addNodeToHead(node);
    }

    private void removeNode(ListNodeNullable node) {
        ListNodeNullable previous = node.previous;
        ListNodeNullable next = node.next;

        previous.next = next;
        next.previous = previous;
    }

    private void addNodeToHead(ListNodeNullable node) {
        ListNodeNullable next = head.next;
        next.previous = node;
        node.next = next;
        node.previous = head;
        head.next = node;
    }

    private ListNodeNullable removeTail() {
        ListNodeNullable tailNode = tail.previous;
        removeNode(tailNode);
        return tailNode;
    }
}
