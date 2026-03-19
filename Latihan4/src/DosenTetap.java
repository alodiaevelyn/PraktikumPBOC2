/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan metode dalam class DosenTetap
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /*********** ATRIBUT ***********/
    private String NIDN;

    /*********** METHOD ***********/
    // Konstruktor
    public DosenTetap() {
        this.NIDN = "";
    }

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    // Getter Dosen Tetap
    public String getNIDN() {
        return NIDN;
    }

    // Setter Dosen Tetap
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    // Menghitung BUP
    public LocalDate BUP() {
        return tanggalLahir.plusYears(65);
    }

    // Menghitung tanggal pensiun
    public LocalDate tanggalPensiun() {
        return BUP().plusMonths(1);
    }

    // Menghitung tunjangan dosen tetap
    @Override
    public double tunjangan() {
        int tahun = java.time.Period.between(TMT, LocalDate.now()).getYears();
        return 0.02 * tahun * gajiPokok;
    }

    // Print
    @Override
    public void printInfo() {
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("NIDN            : " + NIDN);
        super.printInfo();
        System.out.println("BUP             : " + BUP());
        System.out.println("Tanggal Pensiun : " + tanggalPensiun());
    }
}
