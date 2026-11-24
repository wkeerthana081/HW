class Product{
    String productName;
    int quantity;
    double price;
    Product(){
        productName = "Unknown";
        quantity = 1;
        price = 100;
    }
    Product(String productName){
        this.productName = productName;
        quantity = 1;
        price = 100;
    }
    Product(String productName, int quality, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void calculateTotal(){
        System.out.println("Total price:RS" + (quantity * price));
    }

}


public class task31 {
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 2, 15000);
        p1.calculateTotal();
        p2.calculateTotal();
        p3.calculateTotal();
    }
}
