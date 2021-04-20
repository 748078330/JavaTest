import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
       /* int[] lt={60,80,90,70,85};
        double lt2;
        lt2=((lt[0]+lt[1]+lt[2]+lt[3]+lt[4])/5);
        System.out.println("平均数=为"+lt2);*/

        /*int[] lt=new int[5];
        double sum=0;
        Scanner input= new Scanner(System.in);
        for ( int i=0;i<5;i++){
            System.out.println("输入的第"+(i+1)+"个数字为：");
            lt[i]=input.nextInt();
            sum+=lt[i];
        }
        System.out.println("平均数="+(sum/5));*/

       /* int[] lt={8,4,2,1,23,344,12};
        Scanner input =new Scanner(System.in);
        double sum;
        sum=(sum=lt[0]+lt[1]+lt[3]+lt[4]+lt[5]+lt[6]);
        System.out.println("数值的和等于："+sum);
        System.out.println("请输入一个数字");
        int num=input.nextInt();
        for (int i=0 ;i<lt.length;i++){

            if (num == lt [i]){
                System.out.println("数组里序列号为；"+i);
                break;
            }
                else {
                System.out.println("数组里没有这个数请重新输入；");
                break;
            }*/

/*
        System.out.println("请输入会员本月的消费记录；");
        double[] lt = new double[5];
        double sum = 0.0;
        double num;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < lt.length; i++) {
            System.out.println("请输入第" + (i + 1) + "笔购物金额");
            num = input.nextDouble();
            lt[i] = num;
            sum += lt[i];
        }
        System.out.println("序号" + "\t\t\t\t" + "金额（元）");
        for (int i = 0; i < lt.length; i++) {
            System.out.println((i + 1) + "\t\t\t\t" + lt[i]);
        }
        System.out.println("总金额:" + "\t\t\t" + sum);
*/

        /*double[] lt = new double[3];
        double max = 0.0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入一个人数");
            double mum = input.nextDouble();
            lt[i] = mum;
            if (max < lt[i]) {
                max = lt[i];
            }

        }
        System.out.println("输出最大值是" + max);*/

       /* Scanner input =new Scanner(System.in);
        System.out.println("请输入你要插入的数");
        int max=input.nextInt();
        int[] array ={100,80,70,50,30};
        int[] lt=new int[array.length+1];
        int i=0;
       for (;i<array.length;i++){
           if (array[i]>max){
             lt[i]=array[i];
           }
           else{
               break;
           }
       }
       lt[i]=max;
       for (;i<array.length;i++){
           lt[i+1]=array[i];
       }
       for (int j=0;j< lt.length;j++){
           System.out.println(lt[j]);
       }*/

        /*int temp;
        int[] lt={82,63,99,85,60,50,40,98,45,65};
        for (int i=0;i< lt.length;i++){
            for (int j=0;j< lt.length-i-1;j++){
                if (lt[j]>lt[j+1]){
                 temp=lt[j+1];
                 lt[j+1]=lt[j];
                 lt[j]=temp;
                }
            }
        }
        for (int i=0;i< lt.length;i++){
            System.out.println(lt[i]);
        }*/

        /*int temp;
        int[] lt={99,15,45,65,75,14,47,25,16,47};
        for (int i=0;i< lt.length;i++){
            for (int j=0;j<lt.length-i-1;j++){
                if (lt[j]<lt[j+1]){
                    temp=lt[j+1];
                    lt[j+1]=lt[j];
                    lt[j]=temp;
                }
            }
        }
        for (int i=0;i< lt.length;i++){
            System.out.println(lt[i]);
        }*/







    }


}
