package JualKaset;

public class DVD2 extends Product {
    protected int length;
    protected String rating;
    protected String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD2(int number, String name, int quantity, double price) {
        super(number, name, quantity, price);
        this.number = number;
        this.name=name;
        this.quantity= quantity;
        this.price=price;
    }
    
    
    
    
    public DVD2() {
        super(2, "Selalu Dikucilkan", 0, 1000000.0);
        length = 42;
        rating = "Remaja, Dewasa";
        studio = "Radeon RX Present";
    }

    public void printDVD2() {
        System.out.println("CD Nomer: "+number);
        System.out.println("Judul: "+ name);
        System.out.println("Jumlah Kaset: "+quantity);
        System.out.println("Harga: "+price);
        System.out.println("Durasi: "+length+" jam");
        System.out.println("Rating: "+rating);
        System.out.println("Label: "+studio);
 }
}
