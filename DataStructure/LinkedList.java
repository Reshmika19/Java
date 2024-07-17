package DataStructure;

public class LinkedList {

    Node head;

    public void insert(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
            head = node;
        else{
            Node n = head;
            while(n.next!=null){
               n = n.next;
            }
            n.next = node;
        }

    }

    public void insertAtStart(int data){
        Node n = new Node();
        n.data = data;
        n.next = head;

        head = n;
    }

    public void insertAtEnd(int data){
        Node n = new Node();
        n.data = data;
        n.next = null;

        Node node = head;

        while (node.next!=null){
            node = node.next;
        }
        node.next = n;
    }

    public void insertAt(int data , int pos){
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;

        if(pos == 0){
            insertAtStart(data);
            return;
        }

        for(int i = 0 ; i < pos - 1 ; i++)
            n = n.next;

        node.next =  n.next;
        n.next = node;
    }

    public void search(int data){
        Node n = head;
        int c = -1;
        while(n.next != null){
           if( n.data == data) {
               System.out.println("The element found " + n.data + " at " + (c+1));
               break;
           }
           n = n.next;
           c++;
        }

    }


    public void delete(int pos){

        if(pos == 0)
            head = head.next;

        Node n =head;
        for(int i = 0 ; i<pos -1 ; i++){
            n = n.next;
        }
        Node n1 = n.next;
        n.next = n1.next;
       // System.out.println("The deleted element is " + n1.data);
        /*
        0       1     2     3   4     Pos - 4 --> 13
        10 -> 11 -> 12 -> 13 -> 14
        loop 12
        n.next points 13
        sacing it as temp(13) = n.next(13) that node points 14
        then n.next = temp.next
        what happens means 13 is removed 12 -> 14
         */
        n1 = null;
    }

    public void show(){

        Node n = head;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println(n.data);

    }

}
