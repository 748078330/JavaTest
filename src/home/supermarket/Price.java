package home.supermarket;

public  class Price {
    //父类被继承才能 多态               //形参对象
    public static Goods price(Goods goods){
        if (goods instanceof Food){
            goods.price = goods.price*0.8;
        }
        else if (goods instanceof Tv){
            goods.price= goods.price*0.9;
        }
        return goods;

    }

}
