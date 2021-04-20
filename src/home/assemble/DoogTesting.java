package home.assemble;

public class DoogTesting {
    public static void main(String[] args) {
        System.out.println("商店里共有"+Doog.doogslist.size()+"条狗狗");
        Doog doog;
        //遍历
        for (int i=0;i<Doog.doogslist.size();i++){
            doog =Doog.doogslist.get(i);
            System.out.println("名字"+"  "+doog.name+ "  "+"种类"+"  " +doog.type);
        }
        System.out.println("卖出之前一共有"+Doog.doogslist.size()+"条狗狗");

        Doog.doogslist.remove(0);
        Doog.doogslist.remove(2);
        System.out.println("卖出两只还剩"+Doog.doogslist.size()+"只");
        //遍历
        for (int i=0;i<Doog.doogslist.size();i++){
            doog =Doog.doogslist.get(i);
            System.out.println("名字   "+doog.name+ "  "+"种类"+"  " +doog.type);

        }

        System.out.println("=================================================");
        Doog doog5 =new Doog();
        doog5.type="吉娃娃";
        doog5.name="毛豆";
        System.out.println("商店里又来了一只狗狗"+"   名字   "+doog5.name+"   种类   "+doog5.type);

        Doog.doogslist.add(1,doog5);
        for (int i=0;i<Doog.doogslist.size();i++){
            doog =Doog.doogslist.get(i);
            System.out.println("名字   "+doog.name+ "  "+"种类"+"  " +doog.type);
        }

        Doog.doogslist.addLast(doog5);
        System.out.println("=================================================");
        System.out.println("此时最后一条狗狗  "+"名字  "+Doog.doogslist.getLast().name+"  种类  "+Doog.doogslist.getLast().type);
    }

}
