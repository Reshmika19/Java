package DataStructure;

public class Runner {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(19);
        l.insert(12);
        l.insert(2003);

        l.insertAtStart(5);

        l.insertAtEnd(4);

        l.insertAt(6,2);
        l.insertAt(18,1);

        l.search(19);

        l.delete(6);

        l.show();

    }
}
