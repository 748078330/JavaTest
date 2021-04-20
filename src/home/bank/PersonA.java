package home.bank;

public class PersonA implements Runnable{
    // 创建银行对象
    Bank bank;

    // 通过构造一个银行对象bank 让两个人进入一个银行
    public PersonA(Bank bank) {
        this.bank = bank;
    }
    // 重写run方法，在里面使用柜台取钱
    @Override
    public void run() {
        while (bank.money >= 100) {
            bank.getCounter(100);// 每次取走100块
            try {
                Thread.sleep(200);// 取完休息0.2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
