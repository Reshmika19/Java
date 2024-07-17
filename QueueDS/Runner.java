package QueueDS;

public class Runner {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.show();

        q.deQueue();
        q.show();

        q.enQueue(1);

        q.show();

        q.deQueue();
        q.deQueue();
        q.show();

        System.out.println("Size : " + q.getSize());
        System.out.println("IsEmpty ? " + q.isEmpty());
        System.out.println("IsFull ? " + q.isFull());

    }
}
