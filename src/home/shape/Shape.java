package home.shape;

public class Shape {
    double chang;
    double kuang;
    double mianji;
    final double PI=3.14;
    double banjin;
    public void rectangle(){
        mianji=chang*kuang;
    }
    public void circular(){
        mianji=PI*banjin*banjin;
    }
}
