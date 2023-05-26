package org.example;

public class TestStack {

    private int[] arr;
    private int capacity;
    private int top;

    public TestStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int elt){
        if (isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }

        arr[++top] = elt;
    }

    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println(arr[top]);
        return arr[top];
    }

    private boolean isFull(){
        return top == capacity -1;
    }

    private boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {

        TestStack stack1 = new TestStack(5);

        stack1.push(1);
        stack1.push(3);
        stack1.push(11);
        stack1.push(7);
        stack1.push(0);
        stack1.peek();
        stack1.pop();
        stack1.peek();
    }
}
