package com.pallamsetty.linkedlist.helpers;

public class ListNodeNullable {
    public Integer key;
    public Integer value;
    public ListNodeNullable next;
    public ListNodeNullable previous;

    public ListNodeNullable() {}

    public ListNodeNullable(int key, int data) {
        this.key = key;
        this.value = data;
    }
}
