package home.computer;

public class CComputer {
    public static void main(String[] args) {
        Computer1 r1=new Computer1();
        System.out.println("下面主机配置内容");
        r1.cpu();
        r1.disk();
        r1.memory();
    }
}
