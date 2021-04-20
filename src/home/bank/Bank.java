package home.bank;

import java.util.Scanner;

public class Bank  {
    // 一个账户有5000块钱
    static int money = 5000;

    // 柜台取钱的方法 使用synchronized 方法锁
    public synchronized void getCounter(int money1) {
        Bank.money -= money1;// 取钱后总数减少
        System.out.println("柜台取走了" + money1 + "还剩下" + Bank.money);
    }

    // ATM取钱的方法
    public synchronized void getATM(int money2) {// 参数是每次取走的钱
        Bank.money -= money2;// 取钱后总数减少
        System.out.println("ATM取走了" + money2 + "还剩下" + Bank.money);
    }

}

