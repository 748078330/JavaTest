package home.animal;

import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Dog dog =new Dog();
        Cats cats=new Cats();
        dog.name="腾林";
        cats.name="波波";
        dog.gender="公";
        cats.gender="母";
        dog.dogfod="骨头,狗粮";
        cats.catsfod="鱼,猫粮,鸡胸肉";
        System.out.println("欢迎进入宠物管理系统！");
        System.out.println("请选择宠物:1,狗 2,猫");
        int animal =input.nextInt();
        if (animal==1){
            System.out.println("姓名:"+dog.name+"\n"+"性别:"+dog.gender+"\n"+"食物:"+dog.dogfod);
        }
        else if (animal==2){
            System.out.println("姓名:"+cats.name+"\n"+"性别:"+cats.gender+"\n"+"食物:"+cats.catsfod);
        }
    }
}
