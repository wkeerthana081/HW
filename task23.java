abstract class Payment{
    double amount;
    Payment(double amount){

    }
    void showAmount(){
        System.out.println("Payment Amount Rs" + amount);
    }
    abstract void processPayment();
}
class UPIPayment extends Payment{
    UPIPayment(double amount){
    super(amount);
    }
    void processPayment(){
        System.out.println("Payment processed successfully");
    }
}
public class task23 {
    public static void main(String[] args) {
        UPIPayment u = new UPIPayment(5000);
        u.showAmount();
        u.processPayment();
    }
}
