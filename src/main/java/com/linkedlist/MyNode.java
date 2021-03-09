package com.linkedlist;

public class MyNode<k> {
    private  MyNode next;
    private  k key;

    public MyNode(k key) {
        this.key = null;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
