package JualKaset;

public class DVD2 extends Product {
    protected int length;
    protected String rating;
    protected String studio;

    public DVD2() {
        number = 2;
        name = "Tidak Sadar Diri";
        quantity = 20;
        price = 2000000.0;
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
