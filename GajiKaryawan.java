import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        int gajiKaryawan, jamKerja, tarifPerjam, pajakGaji=10, gajiPerbulan=30;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jam Kerja: ");
        jamKerja = input.nextInt();
        System.out.println("Masukkan Tarif Per Jam: ");
        tarifPerjam = input.nextInt();

        gajiKaryawan = jamKerja*tarifPerjam;
        pajakGaji = (pajakGaji/100)*gajiKaryawan;
        gajiKaryawan = gajiKaryawan-pajakGaji;
        gajiPerbulan = gajiKaryawan*gajiPerbulan;

        System.out.println("Gaji Lu Jadi Segini Bre: "+gajiKaryawan);
        System.out.println("Kalo Perbulan Jadi Gini Bree: "+gajiPerbulan);

    }
}
