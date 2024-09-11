package JualKaset;

public class DVD extends Product {
    protected int length;
    protected String rating;
    protected String studio;

    public DVD() {
        number = 1;
        name = "Perperangan Surga Di Malam Kedua";
        quantity = 1;
        price = 200000.0;
        length = 20;
        rating = "NC-21";
        studio = "NVIDIA RTX Pictures";
    }

    public void printDVD() {
        System.out.println("CD Nomer: "+number);
        System.out.println("Judul: "+ name);
        System.out.println("Jumlah Kaset: "+quantity);
        System.out.println("Harga: "+price);
        System.out.println("Durasi: "+length+" jam");
        System.out.println("Rating: "+rating);
        System.out.println("Label: "+studio);
 }
}
