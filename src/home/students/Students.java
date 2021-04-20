package home.students;

import java.util.HashMap;

public class Students {
    public static void main(String[] args) {
        HashMap<String,Studentss> hashMap=new HashMap();

        Studentss studentss1 =new Studentss();
        studentss1.name="李通";
        studentss1.sex="男";
        studentss1.names="Mack";

        Studentss studentss2 =new Studentss();
        studentss2.name="波波";
        studentss2.sex="男";
        studentss2.names="bobo";

        Studentss studentss3 =new Studentss();
        studentss3.name="长鹤";
        studentss3.sex="男";
        studentss3.names="smok";

        hashMap.put("Msck",studentss1);
        hashMap.put("bobo",studentss2);
        hashMap.put("smok",studentss3);

        Studentss students1 =hashMap.get("Msck");
        System.out.println("通过英文 "+studentss1.names+"获取 "+students1.name);

        Studentss students2 =hashMap.get("bobo");
        System.out.println("通过英文 "+studentss2.names+"获取 "+students2.name);

        Studentss students3 =hashMap.get("smok");
        System.out.println("通过英文 "+studentss3.names+"获取 "+students3.name);

    }
}
