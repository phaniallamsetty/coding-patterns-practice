package com.pallamsetty.trees.helpers;

public class Pair <F, S>{
    F first;
    S second;

    public Pair() {}

    public Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }
}
