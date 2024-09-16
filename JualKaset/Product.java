package JualKaset;
//ini adalah superclass (parent)

public class Product {
    protected int number;
    protected String name;
    protected int quantity;
    protected double price;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public void print() {
        System.out.println("CD Nomer: "+number);
        System.out.println("Album: "+ name);
        System.out.println("Jumlah Kaset: "+quantity);
        System.out.println("Harga: "+price);
    }
}
