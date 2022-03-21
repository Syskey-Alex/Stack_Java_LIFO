package com.company;

public class ArrayStack {
    private final int maxSize = 100;
    private int[] elements;
    private int top;

    private ArrayStack() {
        elements =new  int[maxSize];
        top = -1;

    }

    public void push(int n) {
        if (top<maxSize-1){
        top++;
        elements[top] = n;
        }
    }
public int pop () {
    if (top >=0) {
        int data = elements[top];
        top = top -1;
        return data;
    } else {
        return -1;
    }
}

    public int peek() {
        if (top >=0) {
            int data = elements[top];
            return data;
        } else {
            return -1;
        }
    }
}
