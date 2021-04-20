package home.supermarket;

import java.lang.reflect.TypeVariable;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//接收键盘输入
        Tv tv=new Tv();
        tv.tv="三星";
        System.out.println("请输入"+tv.tv+"商品价格");
        tv.price=scanner.nextDouble();//接收键盘输入的数
        Price.price(tv);//调用功能类方法传入参数
        System.out.println(tv.tv+tv.price);


        Food food=new Food();
        food.food="面包";
        System.out.println("请输入"+food.food+"商品价格");
        food.price=scanner.nextDouble();
        Price.price(food);
        System.out.println(food.food+food.price);
    }
}
