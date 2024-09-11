package JualKaset;
//Ini Adalah SubClass
public class CD1 extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD1() {
        number = 1;
        name = "Aku Yang Melayang";
        quantity = 100;
        price = 100.0;
        artist = "Ahmad Varo";
        totalSong = 1;
        label = "Flying Music";
    }


    public void printCD1() {
        System.out.println("CD Nomer: "+number);
        System.out.println("Judul: "+ name);
        System.out.println("Jumlah Kaset: "+quantity);
        System.out.println("Harga: "+price);
        System.out.println("Artist: "+artist);
        System.out.println("Total Lagu: "+totalSong);
        System.out.println("Label: "+label);
    }
}
