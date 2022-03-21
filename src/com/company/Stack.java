package com.company;

public class Stack extends LinkedList {
    Node top = null;
    Node node = new Node();

    public Stack() {
        super();
        top = null;
    }

    public void push(int n) {
        addFirst(n);

        top.setNext(Node);
        top.getNext();
    }

    public int pop() {
        int v = top == null
                ? null
                : top.getValue();
        if (top != null) {
            top = top.getNext();
            int i = stackSize()--;
        }
        return v;
    }
    public int peek() {
        //just returns the value of the without changing it, hence just "peeking" at the stack
        if (top >= 0) {
            int data = elements[top];
            return data;
        } else {
            return -1;
        }
// lazy and bad way return head.getValue();
    }

    //tells you that there is nothing in the list and can save you from going to the specified value in the list and finding out that there is nothing there.
    public boolean isEmpty() {
//return true if the list has no elements
        return (top == null);
    }

    public boolean isFull() {
        return true;
    }

public int stackSize() {

        int myStack = myStack.size();
        for (int i = 0; i < data.length; i++) {
            //printing size of the array
            System.out.println();
        }
        return myStack;
    }

}
