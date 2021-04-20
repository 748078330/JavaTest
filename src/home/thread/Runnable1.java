package home.thread;

public class Runnable1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + i + "偶数");
                    }
                }
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 51; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + i + "偶数");
                    }
                }
            }
        };
        Thread thread = new Thread();
        thread.start();
        int i = 0;
        while (i < 200) {
            System.out.println(Thread.currentThread().getName() + i + "偶数");
            i++;
        }

        Thread thread1=new Thread(runnable);
        thread1.start();
    }
    }
