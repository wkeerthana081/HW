abstract class BankAccount{
    abstract void calculateInterest();
    void displayAccountType(){
        System.out.println("Bank account details:");
    }
}
class SavingsAccount extends BankAccount{
    double balance;
    @Override
    void calculateInterest() {
        System.out.println(balance * 0.05);
    }
}
public class task22 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.balance = 5000;
        s.displayAccountType();
        System.out.println("Interest Calculated:");
        s.calculateInterest();
    }
}
