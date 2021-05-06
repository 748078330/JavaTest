package home.bird;

public class Birdie {
    public static void main(String[] args) {
        Bird bird= new Bird() {
            @Override
            public void call() {
                System.out.println("小鸟在洗澡");
            }

            @Override
            public void sing() {
                System.out.println("小鸟在吃饭");

            }

            @Override
            public void fly() {
                System.out.println("小鸟在喝水");

            }
        };bird.call();
        bird.fly();
        bird.sing();
    }

}
