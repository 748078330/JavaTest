package home.excel;

public class Student {

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String nam;
    public String mobile;
    public String sex;
    public static  void gatDate(Student[]students){

        Student student1 = new Student();
        student1.nam = "小明";
        student1.mobile = "18888";
        student1.sex = "男";
        Student student2 = new Student();
        student2.nam = "小红";
        student2.mobile = "16666";
        student2.sex = "女";
        Student student3 = new Student();
        student3.nam = "波波";
        student3.mobile = "16666";
        student3.sex = "女";
        Student student4 = new Student();
        student4.nam = "腾腾";
        student4.mobile = "16666";
        student4.sex = "女";
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        students[3]=student4;
    }
}

