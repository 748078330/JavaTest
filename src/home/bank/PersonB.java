package home.bank;

public class PersonB implements Runnable{
    // 创建对象
    Bank bank;
    // 构造对象bank，让两个人进入的是一个银行
    public PersonB(Bank bank) {
        this.bank = bank;
    }
    // 重写run方法，在里面使用 使用ATM取钱
    @Override
    public void run() {
        while (bank.money >= 200) {
            bank.getATM(200);// 每次取钱200块
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
