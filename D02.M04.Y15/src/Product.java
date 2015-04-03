

public class Product {
    String name;
    long id;
    double price;

    @Override
    public String toString() {
        return  "Product id : " + this.id + "\tName : " + this.name + "\tPrice : " + price;
    }

    public Product(String name, long id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
