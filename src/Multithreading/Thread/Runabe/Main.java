package Multithreading.Thread.Runabe;

public class Main implements Runnable{
    static Sum sum=  new Sum();
    public static void main(String[] args) {

        Thread thread =new Thread(new Main());
        thread.start();


        Thread thread2 =new Thread(new Main());
        thread2.start();

        Thread thread3 =new Thread(new Main());
        thread3.start();

    }

    @Override
    public void run() {

        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName());
            sum.getI();
            try {
                sum.sum();
            //if (sum.getI()>100) System.out.println(Thread.activeCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum.getI());
    }
}
