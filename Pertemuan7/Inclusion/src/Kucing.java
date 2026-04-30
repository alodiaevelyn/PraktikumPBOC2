/* Nama File    : Kucing.java 
 * Deskripsi    : Class untuk subclass Anabul yaitu Kucing
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (kucing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (kucing) bersuara meong-meong.");
    }
}