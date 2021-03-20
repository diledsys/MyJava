package Multithreading.Thread;

import java.util.concurrent.TimeUnit;

public class MyThreading {
    public static void main(String[] args) {

        Runnable runnable =()->{

            String curentThread= Thread.currentThread().getName();
            for (int i = 0; i <100 ; i++) {
                // System.out.print("|"+i);
                //System.out.print(curentThread);
            }
            try {
                TimeUnit.SECONDS.sleep( 1 );
                Thread.currentThread().interrupt();
                if (Thread.currentThread().isInterrupted())
                    System.out.println( curentThread );
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        };

        for (int i = 0; i <15 ; i++) {
            new Thread(runnable).start();
//            if (!Thread.currentThread().isInterrupted())
//                System.out.println(Thread.currentThread().getName());
        }
    }
}
