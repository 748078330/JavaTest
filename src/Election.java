import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (Vote.num=0;Vote.num<10;Vote.num++){
            System.out.println("请输入姓名进行投票:");
            String name =input.next();
            System.out.println(name+"感谢您投票成功");
        }
        System.out.println("感谢您投票结束:");
    }

}