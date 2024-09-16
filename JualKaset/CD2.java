package JualKaset;
//Ini Adalah SubClass
public class CD2 extends Product {
    private String artist;
    private static int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return CD2.totalSong;
    }

    public void setTotalSong(int totalSong) {
        CD2.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD2(int number, String name, int quantity, double price) {
        super(number, name, quantity, price);
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public CD2() {
        super(1, "EEk BAkar", 1, 2000000.0);
        artist = "Galang Rehan";
        totalSong = 10;
        label = "ShutUp Music Production";
    }


    public void printCD2() {
        super.print();
        System.out.println("Artist: "+artist);
        System.out.println("Total Lagu: "+totalSong);
        System.out.println("Label: "+label);
    }
}
