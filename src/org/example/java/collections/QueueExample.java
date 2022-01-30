package org.example.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Hello");
        queue.add("Welcome");
        queue.add("Back");

        System.out.println("queue " + queue);

        System.out.println("Head of the queue : " + queue.peek());

        System.out.println("Consumer first element in the queue : " + queue.remove());
        System.out.println("queue " + queue);
    }
}
