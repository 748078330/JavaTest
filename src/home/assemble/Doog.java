package home.assemble;

import java.util.LinkedList;


public class Doog {
    String  name;
    String  type;
    static LinkedList<Doog> doogslist =new LinkedList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    static {
        Doog doog1 =new Doog();
        doog1.type="雪纳瑞";
        doog1.name="欧欧";

        Doog doog2 =new Doog();
        doog2.type="拉布拉多";
        doog2.name="亚亚";

        Doog doog3 =new Doog();
        doog3.type="拉布拉多";
        doog3.name="菲菲";

        Doog doog4 =new Doog();
        doog4.type="雪纳瑞";
        doog4.name="美美";

        doogslist.add(doog1);
        doogslist.add(doog2);
        doogslist.add(doog3);
        doogslist.add(doog4);



    }

}
