interface Alert{
    void sendAlert(String message);
}
class EmailAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Email Alert:" + message);
    }
}
class MobileAlert implements Alert{
    public void  sendAlert(String message){
        System.out.println("Mobile Alert:" + message);
    }
}
public class task26 {
    public static void main(String[] args) {
        EmailAlert e = new EmailAlert();
        MobileAlert m = new MobileAlert();
        e.sendAlert("You have an alert message");
        m.sendAlert("mobile alert");
    }
}
