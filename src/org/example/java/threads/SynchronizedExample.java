package org.example.java.threads;

public class SynchronizedExample {


    public static void main(String[] args) {

        PrintObject p = new PrintObject();

        Thread evenThread = new Thread(new EvenThread(p));
        Thread oddThread = new Thread(new OddThread(p));

        oddThread.start();
        evenThread.start();

        String s = new String();
    }

    // Synchronied block
    // Synchronized method
    public  void synchronizedBlock(){

        synchronized (this){

        }

    }

    public synchronized void synchronizedMethod(){

    }
}
