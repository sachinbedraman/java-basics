package org.example.java.threads;

public class ThreadExtends extends Thread{

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() + " - Hello World - I extend the Thread Class");
    }
}
