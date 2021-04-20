package home.calculate;

import java.lang.reflect.Method;

public class CalculateTest {
    public static void main(String[] args) {

        try {
            Class s =Class.forName("home.calculate.Calculate");
            Method[] methods = s.getDeclaredMethods();
            Object o =s.newInstance();

            int err=0;
            for (int i=0;i<methods.length;i++){
                int j=0;
                if (methods[i].getAnnotations().length>0){
                    try {
                        methods[i].invoke(o,1,0);
                        System.out.println(methods[i].getName()+methods[i].getAnnotations().length+"个注解"+"有"+j+"个异常");
                    }catch ( Exception e){
                        e.getCause().getMessage();
                        j++;
                        err++;
                        System.out.println(methods[i].getName()+methods[i].getAnnotations().length+"个注解"+"有"+j+"个异常");
                    }

                }
            }
            System.out.println("一共有"+err+"个异常");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
