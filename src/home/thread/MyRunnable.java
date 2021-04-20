package home.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=51;i<=100;i++){
            if (i%2==0){
                System.out.println("51到100偶数"+i);
            }
        }
    }
}
