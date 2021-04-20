package home.me;

import home.uncle.*;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
       Me me =new Me();
        me.name ="李通";
        Sister st=new Sister();
        st.name="妮妮";
        Uncle ul=new Uncle();
        ul.name="大汉";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入家庭成员爱好");
        System.out.println("请输入" + me.name + "的爱好");
        me.hobby = input.next();
        System.out.println("请输入" + st.name + "的爱好");
        st.hobby = input.next();
        System.out.println("请输入" + ul.name + "的爱好");
        ul.hobby = input.next();
        if (me.hobby.equals(st.hobby) && st.hobby.equals(ul.hobby)) {
            System.out.println("爱好都一样" + me.hobby);
        } else if (me.hobby.equals(st.hobby)) {
            System.out.println(me.name + "和" + st.name + "爱好都是" + me.hobby);
        } else if (me.hobby.equals(ul.hobby)) {
            System.out.println(me.name + "和" + ul.name + "爱好都是" + me.hobby);
        } else if (st.hobby.equals(ul.hobby)) {
            System.out.println(st.name + "和" + ul.name + "爱好都是" + st.hobby);
        } else {
            System.out.println("爱好都不一样");
        }
    }
}
