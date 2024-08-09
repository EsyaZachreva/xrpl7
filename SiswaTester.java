import java.rmi.registry.RegistryHandler;

public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class Object = new Constuctor
        Siswa ibra = new Siswa();
        Siswa gilam = new Siswa();
        Siswa rehan = new Siswa();
        Siswa moreno = new Siswa();

        ibra.nama = "Nibras Faiz Suryana";
        ibra.ipk = 10.0;
        ibra.id = 29;
        ibra.kategori = "Sedikit Berbahaya";
        gilam.nama = "Mattew Gilam Kyle Marante";
        gilam.ipk = 85.5;
        gilam.id = 19;
        gilam.kategori = "Normal";
        rehan.nama = "Faatihah Ahmad Raihan Ilmihi";
        rehan.ipk = 85.0;
        rehan.id = 11;
        rehan.kategori = "Normal";
        moreno.nama = "Moreno Rizqieta Jauza";
        moreno.ipk = 70.8;
        moreno.id = 24;
        moreno.kategori = "Sedikit Berbahaya";
        
        System.out.println();
        System.out.println("Nama: "+ibra.nama);
        System.out.println("IPK: "+ibra.ipk);
        System.out.println("ID: "+ibra.id);
        System.out.println("Kategori Sifat: "+ibra.kategori);
        System.out.println();
        System.out.println("Nama: "+rehan.nama);
        System.out.println("IPK: "+rehan.ipk);
        System.out.println("ID: "+rehan.id);
        System.out.println("Kategori: "+rehan.kategori);
        System.out.println();
        System.out.println("Nama: "+gilam.nama);
        System.out.println("IPK: "+gilam.ipk);
        System.out.println("ID: "+gilam.id);
        System.out.println("Kategori: "+gilam.kategori);
        System.out.println();
        System.out.println("Nama: "+moreno.nama);
        System.out.println("IPK: "+moreno.ipk);
        System.out.println("ID: "+moreno.id);
        System.out.println("Kategori: "+moreno.kategori);
        System.out.println();
    }
}
