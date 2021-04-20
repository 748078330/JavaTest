package home.user;

import home.openDoor.OpenDoorAnno;

import java.lang.reflect.Method;
import java.util.Scanner;

public class UserTest {
    @Userlnfo
    public void login(){
        try {

            Scanner scanner=new Scanner(System.in);
            Class<?> aClass = Class.forName("home.user.UserTest");
            Method login = aClass.getDeclaredMethod("login");
            Userlnfo annotation = login.getAnnotation(Userlnfo.class);
            System.out.println("请输入账号");
            String next1 = scanner.next();
            System.out.println("请输入密码");
            String next2 = scanner.next();

            if (next1.equals(annotation.surname())&&next2.equals(annotation.password())){
                System.out.println("用户名密码正确");
            }else {
                System.out.println("用户名或密码不正确");
            }

        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserTest userTest =new UserTest();
        userTest.login();
    }
}
