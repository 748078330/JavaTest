package home.bird;

public class Cuckoo implements Bird{
    @Override
    public void call() {
        System.out.println("小鸟在叫");
    }

    @Override
    public void sing() {
        System.out.println("小鸟在飞");

    }

    @Override
    public void fly() {
        System.out.println("小鸟在唱歌");

    }
}
