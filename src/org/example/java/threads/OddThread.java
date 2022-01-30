package org.example.java.threads;

public class OddThread  implements  Runnable{
    PrintObject p;

    public OddThread(PrintObject p){
        this.p = p;
    }

    @Override
    public void run() {
        System.out.println("Odd Thread Holding lock");
       synchronized (p) {
           System.out.println("Odd Thread Acquired lock");
            for (int i = 1; i <= 50; i = i + 2)
                p.print("Odd Thread " + i + "");
       }
        System.out.println("Odd Thread Exited lock");
    }
}
