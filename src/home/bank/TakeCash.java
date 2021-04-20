package home.bank;

public class TakeCash {
    public static void main(String[] args) {
        //创建对象
        Bank bank = new Bank();
        PersonA pA = new PersonA(bank);
        Thread T1=new Thread(pA);
        PersonB pB = new PersonB(bank);
        Thread T2=new Thread(pB);
        // 两个人开始取钱
        T1.start();
        T2.start();

    }
}
