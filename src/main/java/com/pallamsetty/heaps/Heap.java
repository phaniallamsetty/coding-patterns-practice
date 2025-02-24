package com.pallamsetty.heaps;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    List<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void push(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        if(i == 1) {
            return;
        }

        while(heap.get(i/2) > heap.get(i)) {
            int temp = heap.get(i);
            heap.set(i, heap.get(i/2));
            heap.set(i/2, temp);
            i = i/2;
        }
    }

    public int pop() {
        if(heap.size() == 1) {
            // equivalent to null
            return Integer.MIN_VALUE;
        }

        if(heap.size() == 2) {
            return heap.remove(heap.size() - 1);
        }

        int result = heap.get(1);
        heap.set(1, heap.remove(heap.size() - 1));
        int i = 1;

        while(2 * i < heap.size()) {
            if(2*i+1 < heap.size() &&
                heap.get(2*i+1) < heap.get(2*i) &&
                heap.get(i) > heap.get(2*i+1)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(2*i+1));
                heap.set(2*i+1, temp);
                i = 2*i+1;
            } else if(heap.get(i) > heap.get(2*i)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(2*i));
                heap.set(2*i, temp);
                i = 2*i;
            } else {
                break;
            }
        }

        return result;
    }
}
