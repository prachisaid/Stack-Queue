package StackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(9);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);

        queue.display();

    }
}
