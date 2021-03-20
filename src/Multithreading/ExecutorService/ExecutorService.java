package Multithreading.ExecutorService;


import java.util.concurrent.Executor;


public class ExecutorService {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Task executed");
        Executor executor = (runnable) -> {
            new Thread(runnable).start();
        };
        executor.execute(task);
    }
}
