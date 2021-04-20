package home.thread;

public class My {
    public static void main(String[] args) {
        MyThread my1=new MyThread();
        my1.start();
        MyRunnable my =new MyRunnable();
        Thread my2=new Thread(my);
        my2.start();
    }

}
