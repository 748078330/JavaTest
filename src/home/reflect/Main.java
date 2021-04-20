package home.reflect;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        ClassLoader classLoader = Student.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("home/reflect/poroperties.properties");
        Properties properties = new Properties();


        try {
            properties.load(inputStream);

        String classNameValue = properties.getProperty("className");//home.reflect.Student 类的名字
        String methodNameValue1 = properties.getProperty("methodName1");//getName 类的方法
            String methodNameValue2 = properties.getProperty("methodName2");//setName 类的方法
        System.out.println("className="+classNameValue);
        System.out.println("methodName1="+methodNameValue1);
        System.out.println("methodName2="+methodNameValue2);

        Class cl=Class.forName(classNameValue);//获取类的字节码文件
        Object ob= cl.newInstance();//创建一个ob对象
        Method method1 =cl.getMethod(methodNameValue1);//获取cl.get方法
        String st1= (String) method1.invoke(ob); //实现 cl.get 方法 加入ob对象
        System.out.println(st1);
        Method method2 =cl.getMethod(methodNameValue2,String.class);
        method2.invoke(ob,new String("修改后的名字小明"));
        String  st2 = (String) method1.invoke(ob);//进行强行转换
        System.out.println(st2);


        } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
