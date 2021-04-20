package home.abnormal;

import java.util.Scanner;
import java.util.logging.FileHandler;

public class Courses {
    public static void main(String[] args) throws ArithmeticException{
        System.out.println("请输入1，2，3代表的课程名称");
        Scanner input =new Scanner(System.in);
        try {
            int num =input.nextInt();
            if (num==1){
                System.out.println("java课程");
            }
            else if (num==2){
                System.out.println("C语言课程");
            }
            else if (num==3){
                System.out.println("嵌入式课程");
            }
            else {
                System.err.println("输入错误");
            }
          }catch (Exception exception){
            System.err.println("输入错误");
        }
        finally {
            System.out.println("欢迎提出建议");
        }
    }
}
