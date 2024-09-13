package perulangan;

import java.util.Scanner;

public class pengulangansiswa {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai = 0;
        double ratarata;

        Scanner o = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa: ");
        jumlahSiswa = o.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan Nilai Siswa "+i+" : ");
            nilai = o.nextInt();
            totalNilai += nilai;
        }

        ratarata = totalNilai/jumlahSiswa;
        System.out.println("Total Nilai: "+totalNilai);
        System.out.println("Rata - Rata: "+ratarata);
    }
}
