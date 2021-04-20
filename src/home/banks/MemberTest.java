package home.banks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MemberTest {
    public static void main(String[] args) {
        //Member 一个数组集合
        ArrayList <Member> arrayList= new ArrayList(1000);
        for (int i=0; i<1000;i++){
            //定义一个成员变量
            Member member =new Member();
            //随机一个随机取一个0-1的数 给v
            int v = (int) (Math.random() * Member.names.length);
            member.name= Member.names[v];
            int m = (int) (Math.random() * 1000);
            member.money = m;
            arrayList.add(i,member);
        }

        int litong =0;
        int zhaobo =0;
        for (int i =0; i<1000;i++){
            if (arrayList.get(i).name.equals("李通")) {
                 litong ++;
            }else if (arrayList.get(i).name.equals("赵波")){
                zhaobo ++;
            }
        }

        if (litong<zhaobo){
            System.out.println("赵波消费次数多  "+zhaobo);
        }else if (litong>zhaobo){
            System.out.println("李通消费次数多  "+litong);
        }else  if (litong==zhaobo){
            System.out.println("两个人消费次数一样");
        }

        int max =0;
        for (int i=0;i<1000;i++){
            if (arrayList.get(i).money>max){
                max=arrayList.get(i).money;
            }
        }
        System.out.println("消费最大金额是  "+max);

        for (int i=0;i<1000;i++){
            if (arrayList.get(i).money==max){
                System.out.println("消费最大金额的人是  "+arrayList.get(i).name);
            }
        }
    }
}
