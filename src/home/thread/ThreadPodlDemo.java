package home.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPodlDemo {
    public static void main(String[] args) {
        Runnable runnable1 =new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1"+Thread.currentThread().getName());
            }
        };

        Runnable runnable2 =new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable2"+Thread.currentThread().getName());
            }
        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(runnable1);
        service.submit(runnable2);
    }
}
