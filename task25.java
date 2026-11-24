interface PaymentGateWay{
    abstract void makePayment();
}
class GooglePay implements PaymentGateWay{
    public void makePayment(){
        System.out.println("Payment completed using Gpay");
    }
}
class Phonepe implements PaymentGateWay{
    public void makePayment(){
        System.out.println("Payment completed using phonepe");
    }
}

public class task25 {
    public static void main(String[] args) {
    PaymentGateWay p1 = new GooglePay();
    PaymentGateWay p2 = new Phonepe();
    p1.makePayment();
    p2.makePayment();
    }
}
