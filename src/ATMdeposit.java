public class ATMdeposit {
    int error;
    double sum;
    double all;
//get形参
    //set是传参
    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all+= all;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        sum=error*200;
        this.sum = sum;
    }
}
