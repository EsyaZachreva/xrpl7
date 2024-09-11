package JualKaset;
//Ini Adalah SubClass
public class CD2 extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD2() {
        number = 2;
        name = "Makanlah Tahiku Yang Sedap Ini";
        quantity = 100;
        price = 100000.0;
        artist = "Galang Rehan";
        totalSong = 10;
        label = "ShutUp Music Production";
    }


    public void printCD2() {
        System.out.println("CD Nomer: "+number);
        System.out.println("Album: "+ name);
        System.out.println("Jumlah Kaset: "+quantity);
        System.out.println("Harga: "+price);
        System.out.println("Artist: "+artist);
        System.out.println("Total Lagu: "+totalSong);
        System.out.println("Label: "+label);
    }
}
