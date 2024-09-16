package JualKaset;
//Ini Adalah SubClass
public class CD1 extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD1(int number, String name, int quantity, double price) {
        super(number, name, quantity, price);
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        
    }

    public CD1() {
        super(1, "DJ ALOk", 0, 100000.0);
        this.artist = "Bang Rehan";
        this.totalSong = 1;
        this.label = "EEK Studio";
        
    }

    public void printCD1() {
        super.print();
        System.out.println("Artist: "+artist);
        System.out.println("Total Lagu: "+totalSong);
        System.out.println("Label: "+label);
    }
}
