/* Nama File    : MBangunDatar.java
 * Deskripsi    : file main untuk class BangunDatar
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main (String[] args) {
        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Hijau", "Hitam");
        BangunDatar L1 = new Lingkaran(7, "Kuning", "Hitam");
        Lingkaran L2 = new Lingkaran(14, "Biru", "Hitam");

        System.out.println("Luas P1 == L1 ? : " + P1.isEqualLuas(L1));
        System.out.println("Keliling P2 == L2 ? : " + P2.isEqualKeliling(L2));

        ((Persegi) P1).zoomIn();
        P2.zoomOut();

        ((Lingkaran) L1).zoomIn();
        L2.zoomOut();

        System.out.println("Sisi P1 setelah zoom in: " + ((Persegi)P1).getSisi());
        System.out.println("Sisi P2 setelah zoom out: " + P2.getSisi());
        System.out.println("Jari L1 setelah zoom in: " + ((Lingkaran)L1).getJari());
        System.out.println("Jari L2 setelah zoom out: " + L2.getJari());
    }
}