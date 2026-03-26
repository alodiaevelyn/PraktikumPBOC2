/* Nama File    : Asersi1.java
 * Deskripsi    : program untuk menunjukkan asersi
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Maret 2026
 */

public class Asersi1 {
    public static void main (String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        }
        else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}