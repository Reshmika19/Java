package StackDS;

public class DStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){

        if (size() == capacity)
            extend();

        stack[top] = data;
        top++;

    }

    public int pop(){
        int data = 0;
        if(isEmpty())
           System.out.println("Stack is Empty");
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
            //dynamic shrinking
            shrink();

        }
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public int peek(){
        int data ;
        data = stack[top];
        return data;
    }

    public void extend(){
        int len = size();
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack , 0 , newStack , 0 , len);
        stack = newStack;
        capacity *= 2;
    }

    public void shrink(){
        int len = size();
        if(len <= (capacity/2)/2)
            capacity = capacity/2;

        int[] StackD = new int[capacity];
        System.arraycopy(stack , 0 , StackD , 0 , len);
        stack = StackD;
    }

    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
