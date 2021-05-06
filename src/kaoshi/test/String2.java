package kaoshi.test;

import java.util.Scanner;

public class String2 {
    public static void main(java.lang.String[] args) {
        Scanner input =new Scanner(System.in);
        java.lang.String string =input.next();
        System.out.println("请输入一段字符串");
        System.out.println("一共有"+string.length()+"个字符");
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (i==string.length()-1){
                System.out.print(c);
            }else {
                System.out.print(c+" ");
            }

        }
    }
}
