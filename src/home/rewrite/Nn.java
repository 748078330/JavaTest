package home.rewrite;

class Nn extends Dog{
    public void show(){
        super.name="楠楠";
        super.close=0;
        super.health=100;
        System.out.println("宠物的自白");
        System.out.println("我的名字叫"+name+"我的健康值是"+health+"我和主人的亲密度"+close);
    }
}
