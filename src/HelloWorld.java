import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import com.sun.org.apache.xpath.internal.compiler.PsuedoNames;
import jdk.nashorn.internal.objects.annotations.Where;

import java.util.Scanner;

public class HelloWorld {
    //简写：psvm
    public static void main(String[] args) {
        //简写：sout
/*          System.out.println("早上好！");
            System.out.println("李通");
            System.out.println("28岁");
            System.out.println("江苏南京");*/
        /*String name="李通";
        int a =28;
        int b =3;
        int c =5;
        String a1 ="java";
        String a2 ="篮球";
        System.out.println("这个同学的姓名："+name);
        System.out.println("年龄是："+a);
        System.out.println("工作了"+b+"年了");
        System.out.println("做了"+c+"个项目");
        System.out.println("技术方向是"+a1);
        System.out.println("兴趣爱好："+a2);*/


        //Scanner使用
        /*Scanner input = new Scanner(System.in);
        System.out.println("请输入5位会员会员卡号：");
        int unt =input.nextInt();
        int a =unt/10000;
        int b =unt%10000/1000;
        int c =unt%10000%1000/100;
        int d =unt%10000%1000%100/10;
        int e =unt%10000%1000%100%10/1;
        int sum= a+b+c+d+e;
        System.out.println("会员卡号是；"+unt);
        System.out.println("万位数"+a+"千位数:"+b+"百位数:"+c+"十位数:"+d+"个位数："+e+"总和："+sum);
        String li=sum>20?"恭喜您中奖了":"很遗憾您未中奖！";
        System.out.println(li);*/

//        Scanner input =new Scanner(System.in);
//        System.out.println("张浩的java成绩");
//        int a =input.nextInt ();
//        Scanner input1 =new Scanner(System.in);
//        System.out.println("张浩的音乐成绩");
//        int b =input1.nextInt ();
//
//        if ((a>90&&b>80)||(a==100&&b>70)){
//            System.out.println("恭喜获得奖励！");
//        }
//      else {System.out.println("没有奖励！");}

       /* Scanner input =new Scanner(System.in);
        System.out.println("姓名：");
        String xm =input.next();
        System.out.println("性别：");
        String xb =input.next();
        System.out.println("赛跑成绩：");
        int sp =input.nextInt();
        if (xb.equals("男")&&sp<10){
            System.out.println("恭喜进入男子组！");

        }
        else if (xb.equals("女")&&sp<10){
            System.out.println("恭喜进入女子组！");

        }
        else {
            System.out.println("不符合要求！");
        }*/


/*        Scanner input = new Scanner(System.in);
        System.out.println("请输四位入会员号：");
        int unm = input.nextInt();
        int a = unm % 1000 / 100;
        int random = (int) (Math.random() * 10);
        if (a == random) {
            System.out.println("恭喜你中奖啦" + unm + "中奖啦");
        }
        else {
            System.out.println("遗憾您没中奖" + unm + "没中奖");
        }*/


/*

        //while循环表达：重要
        int i = 1;
        while (i  <= 10){
            System.out.println("第"+ i +"遍：好好学习java加油！");
            i++;
        }
        //for循环表达：重要
        for(int i=1;i < 100;i++ ){
            System.out.println("好好学习java！第"+i+"次加油！");
        }
        //do while循环表达：重要
        int x =10;
        do {
            System.out.println("x");
            x++;
        }while (x < 20);


*/


       /* 前面知识的运用
        System.out.println("请选择购买的商品：");
        System.out.println("****************");
        System.out.println("1、T恤 2、网球鞋 3、网球拍");
        System.out.println("请输入商品编号1-3或输入n退出：");
        //无限循环；while：是循环的意思（true条件成立的意思）
        while (true){
            Scanner lt=new Scanner(System.in);//定义字符串
            String lt1=lt.next();//接收字符串
            if ("1".equals(lt1)){
                System.out.println("您输入的商品：T恤：￥220");
                System.out.println("是否继续购物？y/n");
            }
            else if ("2".equals(lt1)){
                System.out.println("您输入的商品：网球鞋：￥300");
                System.out.println("是否继续购物？y/n");
            }
            else if ("y".equals(lt1)){
                System.out.println("请继续输入商品编号1-3继续进行购物！");
            }
            else if ("3".equals(lt1)){
                System.out.println("您输入的商品：网球拍：￥1000");
                System.out.println("是否继续购物？y/n");
            }
            else if ("n".equals(lt1)){
                System.out.println("感谢回复，再见！");
                break;
            }
            else {
                System.out.println("请输入正确的商品编号1-3或n退出：");
            }
        }

*/

/*
//for循环的应用
        Scanner lt=new Scanner(System.in);
        System.out.println("请输入一个值：");
        int lt1=lt.nextInt ();
        for (int i=0;i <=lt1;i++ ){
            int a=lt1-i;
            int b=i+a;
            System.out.println(i+"+"+lt1+"="+b);
        }
*/

/*


        int sum = 0;
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("总和为" + sum);



        int h = 1;
        int l = 1;
        for (int h = 1; h <= 5; h++) {
            for (int l = 1; l <= 5; l++) {
                System.out.println("*");
                if (l == 5) {
                    System.out.println();
                }

*/

/*

      for (int l=1;l<=5;l++) {
          for (int t=1;t<=5-l;t++){
              System.out.print(" ");
          }
          for (int t = 1; t <= 5; t++) {
              System.out.print("*");
          }
          System.out.println();
      }
*/
/*
        for (int l = 1; l <= 5; l++) {
            for (int t = 1; t <= 5 - l; t++) {
                System.out.print(" ");
            }
            for (int t = 1; t <= 2*l-1; t++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

/*
//99乘法表运用
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + " ");
            }
            System.out.println();
        }
*/
/*

        Double z = 0.0;
        Scanner lt = new Scanner(System.in);
        for (int l = 1; l <= 5; l++) {
            System.out.println("请输入5门课程中第" + l + "门课程的成绩");
            Double s = lt.nextDouble();
            if (s <= 0) {
                System.out.println("您输入分数有误请从新输入！");
                break;
            }
            z += s;
        }
        Double p = z / 5;
        System.out.println("您的平均成绩是" + p);

*/

/*

            int t = 0;
            for (int l = 1; l <= 10; l++) {
                t = l + t;
                if (t > 20) {
                    break;//直接跳出本次循环
                }
            }
            System.out.println("当前值" + t);


            int a = 0;
            for (int b = 1; b <= 10; b++) {
                if (b % 2 == 0) {
                    a = b + a;
                } else {
                    continue;//跳过本次循环，进行下一次操作！
                }
            }
            System.out.println("1-10的偶数和" + a);


*/

//猜数字
       /* int a=(int)(Math.random()*100);
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个数字：");
        while(true){
            int b =input.nextInt();
            if (a<b){
                System.out.println("太大了！");
            }
            else if (a>b){
                System.out.println("太小了！");
            }
            else {
                System.out.println("猜中了！");
                break;
            }

        }*/






        }

    }



















