package home.bird1;

public class Cuckoo {
    public static void main(String[] args) {
        Bird cuckoo=new Bird(){
            public void call(){
                System.out.println("布谷鸟在吃饭");
            }
            public void sing(){
                System.out.println("布谷鸟在唱歌");
            }
            public void fly(){
                System.out.println("布谷鸟在跳舞");
            }
        };
        cuckoo.call();
        cuckoo.fly();
        cuckoo.sing();

    }
}
