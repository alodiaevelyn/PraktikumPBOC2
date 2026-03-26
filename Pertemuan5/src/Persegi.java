/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan metode dalam subclass Persegi
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    /*********** ATRIBUT ***********/
    private double sisi;

    /*********** METHOD ***********/
    // Konstruktor
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Getter Persegi
    public double getSisi() {
        return sisi;
    }

    // Setter Persegi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung Luas
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung Keliling
    public double getKeliling() {
        return sisi * 4;
    }

    // Menghitung Diagonal
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Print Persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // Resize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
}