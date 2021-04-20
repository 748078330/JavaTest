package home;

import java.util.Scanner;

public class Aage {
    public static void main(String[] args) {
        System.out.println("请输入年龄");
        Scanner scanner=new Scanner(System.in);
        try {
            int nem= scanner.nextInt();
            Age age=new Age();//调用类
            age.setAge(nem);
            System.out.println("您的年龄是"+age.age);
        }catch (Exception exception){
            System.err.println("年龄输入错误");
            return;
        }
    }
}
