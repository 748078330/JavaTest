package home.computer;

public class Computer1 implements Memory,Disk,Cpu{


    @Override
    public void cpu() {
        System.out.println("CPU的品牌是intel； i7 10700H  主频率为：2.59GHz");

    }

    @Override
    public void disk() {
        System.out.println("内存条的品牌是海盗船； 16.0GB");

    }

    @Override
    public void memory() {
        System.out.println("硬盘的品牌是三星；1T");

    }
}
