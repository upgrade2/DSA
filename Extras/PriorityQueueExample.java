package Extras;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Polled element: " + priorityQueue.poll());
        System.out.println("Queue after poll: " + priorityQueue);
    }
}
