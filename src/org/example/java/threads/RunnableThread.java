package org.example.java.threads;

public class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() + " - Hello World Thread");
    }
}
