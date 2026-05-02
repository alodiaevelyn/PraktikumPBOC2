/* Nama File    : Anjing.java 
 * Deskripsi    : Class untuk subclass Anabul yaitu Anjing
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (anjing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (anjing) bersuara guk-guk.");
    }
}