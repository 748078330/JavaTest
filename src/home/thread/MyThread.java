package home.thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            if (i%2==0)
            System.out.println("1到50的偶数为"+i);
        }


    }
}
