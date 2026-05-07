/* Nama File    : MBangunDatar.java
 * Deskripsi    : file main untuk Koleksi Dasar
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 7 Mei 2026
 */

public class Main {
    public static void main (String[] args) {
        Teman T1 = new Teman();
        T1.addNama("Iuno");
        T1.addNama("Augusta");
        T1.addNama("Galbrena");
        T1.addNama("Aalto");
        T1.addNama("Zani");
        T1.addNama("Phoebe");

        T1.showTeman();
        System.out.println("Jumlah teman: " + T1.getNbelm());
        System.out.println();

        System.out.println("Apakah Zani ada berada di daftar teman: " + T1.isMember("Zani"));
        System.out.println("Apakah Carlotta ada berada di daftar teman: " + T1.isMember("Carlotta"));

    }
}
