package home.phone;

public class Iphone {
    public static void main(String[] args) {
        Phones01 S01=new Phones01();
        Phonsep40 P40=new Phonsep40();
        System.out.println("这位是一款让波波开了额手机S01");
        S01.telephone();
        S01.text();

        System.out.println("这位是一款让波波开了额手机P40");
        P40.lnternet();
        P40.music();
        P40.pictures();
        P40.telephone();
        P40.video();
    }
}
