package Collection.Queues.PriorityQueues;

import java.util.PriorityQueue;

public class Main1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("aa");
        pq.offer("bbb");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
