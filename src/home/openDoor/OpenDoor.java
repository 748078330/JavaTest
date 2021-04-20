package home.openDoor;

import java.lang.reflect.Method;
public class OpenDoor {
    @OpenDoorAnno()
    boolean openDoor (String inPassword){
        Class cls =OpenDoor.class;
        OpenDoorAnno openDoorAnno =(OpenDoorAnno) cls.getAnnotation(OpenDoorAnno.class);
        System.out.println("openDoorAnnoMain="+openDoorAnno);
        try {
           Method method = cls.getDeclaredMethod("openDoor",String.class);
           openDoorAnno =method.getAnnotation(OpenDoorAnno.class);
            System.out.println("方法上的注释配置口令是："+openDoorAnno.password());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return  inPassword.equals(openDoorAnno.password());
    }

    public static void main(String[] args) {
        OpenDoor openDoor =new OpenDoor();
        boolean r= openDoor.openDoor("111");
    }
}
