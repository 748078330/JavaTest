public class Wow {
    String organization;
    String name;
    String race;
    String job;
    int age;
    String sex;

    public static void main(String[] args) {
        long a =System.currentTimeMillis();
        for (int i =0;i<100000;i++){
            System.out.println(i);
        }
        long b =System.currentTimeMillis();
        System.out.println("耗时："+(b-a));
    }


}
