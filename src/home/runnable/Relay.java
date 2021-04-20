package home.runnable;

public class Relay {
    public static void main(String[] args) {

        Group1 G1 = new Group1();
        Thread T1 = new Thread(G1);
        Group2 G2 = new Group2();
        Thread T2 = new Thread(G2);
        T1.start();
        T2.start();
    }
}
