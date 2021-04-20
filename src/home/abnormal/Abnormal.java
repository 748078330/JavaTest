package home.abnormal;

import java.util.Scanner;

public class Abnormal {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input=new Scanner(System.in);

        System.out.println("请输入被除数");
        try{
            x=input.nextInt();
        }catch (Exception exception){
            System.out.println("请输入正确的被除数字");
            x=0;
            System.exit(0);
        }

        System.out.println("请输入除数");
        try{
            y=input.nextInt();
        }catch (Exception exception){
            System.out.println("请正确输入数字除数");
            y=0;
            System.exit(0);
        }

        System.out.println((double) x/y);
    }
}
