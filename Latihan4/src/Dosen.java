/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan metode dalam class Dosen
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    /*********** ATRIBUT ***********/
    protected String fakultas;

    /*********** METHOD ***********/
    // Konstruktor
    public Dosen() {
        this.fakultas = "";
    }

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    // Getter Dosen
    public String getFakultas() {
        return fakultas;
    }

    // Setter Dosen
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Menghitung Tunjangan
    public abstract double tunjangan();

    // Print
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Tunjangan       : Rp " + tunjangan());
    }
}
