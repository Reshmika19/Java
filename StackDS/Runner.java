package StackDS;

public class Runner {
    public static void main(String[] args) {

        DStack s = new DStack();

        //System.out.println("isEmpty ? " + s.isEmpty());

        s.push(12);
        s.push(19);
        s.push(03);

       s.show();

        s.push(23);
        s.show();
        // s.push(17);
        s.pop();
        s.pop();
        s.show();
        s.pop();
        s.show();



        //System.out.println("The deleted element is " + s.pop());

        //s.show();
        //System.out.println("The last inserted element is " + s.peek());

        //System.out.println("isEmpty ? " + s.isEmpty());

        System.out.println("Size of the stack  - " + s.size());

    }
}
