package org.example.java.threads;

public class EvenThread implements Runnable
{
    PrintObject p;

    public EvenThread(PrintObject p){
        this.p = p;
    }

    @Override
    public void run() {
       System.out.println("Even Thread Holding lock");
        synchronized (p) {
            System.out.println("Even Thread Acquired lock");
            for (int i = 2; i <= 50; i = i + 2)
                p.print("Even Thread " + i + "");
       }
       System.out.println("Even Thread Released lock");

    }
}
