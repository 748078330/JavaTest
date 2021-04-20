package home.doog;

import home.bank.PersonA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DoogTest {
    public static void main(String[] args) {
        Set set =new HashSet();

        Doog doog1 =new Doog();
        doog1.name ="欧欧";
        doog1.type ="雪纳瑞";
        set.add(doog1);

        Doog doog2 =new Doog();
        doog2.name ="亚亚";
        doog2.type ="拉布拉多";
        set.add(doog2);

        Doog doog3 =new Doog();
        doog3.name ="菲菲";
        doog3.type ="拉布拉多";
        set.add(doog3);

        Doog doog4 =new Doog();
        doog4.name ="美美";
        doog4.type ="雪纳瑞";
        set.add(doog4);


        PersonA p1;
        for (Object O:set) {
            p1 =(PersonA) O;
            System.out.println(p1);
        }


    }
}
