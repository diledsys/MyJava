package Multithreading.Thread.Runabe;

public class Sum  {

   private int i;
   private boolean flag;
   synchronized public void sum() throws InterruptedException {

       wait();
       i++;
   }


   synchronized public int getI() {
       notify();
        return i;
    }
}
