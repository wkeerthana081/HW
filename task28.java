interface SmartDevice{
    abstract void connectWifi();
    default void deviceStatus(){
        System.out.println("Smart device is ready");
    }
}
class SmartTv implements SmartDevice {
    public void connectWifi(){
        System.out.println("Smart Tv connected to wifi");
    }
}
class SmartWatch implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart watch connected to wifi");
    }
}
public class task28 {
    public static void main(String[] args) {
        SmartTv st = new SmartTv();
        SmartWatch sw = new SmartWatch();
        st.connectWifi();
        st.deviceStatus();
        sw.connectWifi();
        sw.deviceStatus();
    }
}
