public class KaryawanRun {
    public static void main(String[] args) {
        Karyawan asep = new Karyawan(40, "Asep", "TU", "Bangit, Bawah Langit, Kec. Langit");
        Karyawan yanto = new Karyawan(10, "Yantod Bin Yandex", "Kurikulum", "Jalan Meksiko, Rumah Kuning Dibawah Spiteng");
        Karyawan budi = new Karyawan(100, "Budiono Siregar", "Kapal Lawd", "Jalan Sekdes, Kepala Desa");

        asep.printDong();
        yanto.printDong();
        budi.printDong();
    }
}
