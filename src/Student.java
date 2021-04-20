import java.sql.SQLOutput;

//定义一个类
public class Student {
    String name;//string定义一个类的属性
    int age;
    String classNum;
    String hobby;
    //类的使用方法
    public void output() {
        System.out.println(name + "\n" +
                "年龄：" + age + "\n"
                + "就读于：" + classNum + "\n" + "爱好：" + hobby);
    }
}
