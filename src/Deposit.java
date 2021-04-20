public class Deposit {
    public static void main(String[] args) {
        ATMdeposit bobo =new ATMdeposit();
        System.out.println("***波波的存款信息***");
        for (int i=5;i<31;i+=5){
            bobo.setError(i);
            bobo.setSum(bobo.getError());
            bobo.setAll(bobo.getSum());
            System.out.println("3月"+bobo.getError()+"号存入金额"+bobo.getSum());
        }
        System.out.println("3月份存入金额总和："+ bobo.getAll());
    }
}
