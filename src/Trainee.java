import java.util.Scanner;

public class Trainee {
    String name;
    int results;
    Scanner input = new Scanner(System.in);

    public void setName() {
        System.out.println("请输入姓名：");
        name = input.next();
        System.out.println("请输入成绩；");
        results = input.nextInt();
        if (results < 60) {
            results += 2;
        }
        System.out.println("名字：" + name + "\n" + "成绩：" + results);
    }
}
