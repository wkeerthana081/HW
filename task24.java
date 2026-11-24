
abstract class Delivery {

    void acceptOrder() {
        System.out.println("Delivery order accepted");
    }

    abstract void deliveryProduct();
}

class FoodDelivery extends Delivery {

    @Override
    void deliveryProduct() {
        System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery {
    @Override
    void deliveryProduct() {
        System.out.println("Parcel delivered successfully");
    }
}

public class task24 {
    public static void main(String[] args) {
        FoodDelivery f = new FoodDelivery();
        ParcelDelivery p = new ParcelDelivery();
        f.acceptOrder();
        f.deliveryProduct();

        p.acceptOrder();
        p.deliveryProduct();
    }
}
