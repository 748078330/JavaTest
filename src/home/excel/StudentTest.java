package home.excel;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class StudentTest {
    public static void main(String[] args) {
        ClassLoader classLoader = Student.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("home/excel/excel.properties");
        Properties properties = new Properties();

        Student[] arr = new Student[4];
        Student.gatDate(arr);

        try {
            properties.load(inputStream);
            String classNameValue = properties.getProperty("className");//reflect.exercise.Student 类的名字

            for (int i = 0; i < arr.length; i++) {
                Class cl = Class.forName(classNameValue);
                Object o = arr[i];
                Field[] fides = cl.getDeclaredFields();

                for (int i1 = 0; i1 < fides.length; i1++) {
                    String s = "get" + fides[i1].getName().substring(0, 1).toUpperCase() + fides[i1].getName().substring(1);
                    Method method = cl.getDeclaredMethod(s);
                    Object invoke = method.invoke(o);
                    System.out.print(invoke+"  ");
                }
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
