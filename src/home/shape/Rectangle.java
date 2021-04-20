package home.shape;

public class Rectangle {
    public static void main(String[] args) {
        Shape rectangle=new Shape();
        rectangle.chang=50.5;
        rectangle.kuang=100.5;
        rectangle.rectangle();
        System.out.println("长方形面积"+rectangle.mianji);
    }
}
