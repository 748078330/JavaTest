import java.util.Scanner;

public class DogSystem {
    public static void main(String[] args) {
        System.out.println("欢迎进入宠物管理系统！");
        Dog gou=new Dog();
        Scanner input =new Scanner(System.in);
        System.out.println("请输入新增小狗的姓名；");
        String Dognaem = input.next();
        gou.setDogName(Dognaem);
        System.out.println("请选择小狗的性别:(1,公 2，母)");
        String DogGender =input.next();
        gou.setDogGender(DogGender);
        System.out.println("请选择小狗的年龄:(1-20之间:)");
        int DogAge =input.nextInt();
        gou.setDogAge(DogAge);
        System.out.println("请选择小狗的健康子：(1-100之间：)");
        int DogValue =input.nextInt();
        gou.setDogValue(DogValue);
        System.out.println("小狗的基本信息：");
        System.out.println("宠物的名字:"+gou.getDogName()+"性别是:"+gou.getDogGender()+"年龄是:"+gou.getDogAge()+"健康值是:"+gou.getDogValue());
    }

}
