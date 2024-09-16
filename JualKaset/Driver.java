package JualKaset;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String namaPrint;
        int noCD;
        int noDVD;
        CD1 cd1 = new CD1();
        CD2 cd2 = new CD2();
        DVD dvd = new DVD();
        DVD2 dvd2 = new DVD2();

        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan CD / DVD: ");
        namaPrint = p.nextLine();
        if (namaPrint.equalsIgnoreCase("CD")) {
            System.out.print("CD 1-2: ");
            noCD = p.nextInt();
            if (noCD == 1) {
                cd1.printCD1();
            } else if (noCD == 2) {
                cd2.printCD2();
            } else if (noCD == 0) {
                System.out.println("Jika pilihan anda nomer 0 memang tidak ada, lain kali jangan iseng ya!, ngotak dikit");
            } else {
                System.out.println("Mohon Maaf, Mungkin Nomer CD Yang Anda Maksud Belum Tersedia");
            }
        } else if (namaPrint.equals("DVD")) {
            System.out.print("DVD 1-2: ");
            noDVD = p.nextInt();
            if (noDVD == 1) {
                dvd.printDVD();
            } else if (noDVD == 2) {
                dvd2.printDVD2();
            } else if (noDVD == 0) {
                System.out.println("Jika pilihan anda nomer 0 memang tidak ada, lain kali jangan iseng ya!, ngotak dikit");
            } else {
                System.out.println("Mohon Maaf, Mungkin Nomer DVD Yang Anda Maksud Belum Tersedia");
            }
        } else {
            System.out.println("Anda Belum Memasukkan Apapun");
        }
        p.close();
    }
}
