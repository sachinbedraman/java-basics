package org.example.java.threads;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        RunnableThread r = new RunnableThread();

        Thread t = new Thread(r);

        System.out.println("Starting thread");
        t.start();
        t.setName("Created by implementing Runnable interface");
        Thread t1 = new ThreadExtends();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setName("Created by extending Thread class");
        t1.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Started thread");

    }
}
