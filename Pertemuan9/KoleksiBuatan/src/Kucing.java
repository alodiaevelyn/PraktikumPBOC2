/* Nama File    : Kucing.java 
 * Deskripsi    : Class untuk subclass Anabul yaitu Kucing
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (kucing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (kucing) bersuara meong-meong.");
    }

    public double getBobot() { 
        return bobot; 
    }

    public void printBobot() {
        System.out.println("Bobot: " + bobot);
    }
}