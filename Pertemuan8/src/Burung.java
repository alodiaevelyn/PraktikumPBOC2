/* Nama File    : Burung.java 
 * Deskripsi    : Class untuk subclass Anabul yaitu Burung
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (burung) bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (burung) bersuara cuit-cuit.");
    }
}