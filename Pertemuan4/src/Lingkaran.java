/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan metode dalam subclass Lingkaran
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    /*********** ATRIBUT ***********/
    private double jari;

    /*********** METHOD ***********/
    // Konstruktor
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    // Getter Lingkaran
    public double getJari() {
        return jari;
    }

    // Setter Lingkaran
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menghitung Luas
    public double getLuas() {
        return (22/7) * jari * jari;
    }

    // Menghitung Keliling
    public double getKeliling() {
        return 2 * (22/7) * jari;
    }

    // Menghitung Diameter
    public double getDiameter() {
        return jari * 2;
    }

    // Print Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }
}
