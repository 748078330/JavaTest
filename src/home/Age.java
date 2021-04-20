package home;

public class Age {
    int age;
    public void setAge(int age) throws Exception {
        if (age>=1&&age<=100){
            this.age = age;
        }
       else{
            throw new Exception();//抛出
        }
    }
}
