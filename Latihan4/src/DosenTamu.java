/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan metode dalam class DosenTamu
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /*********** ATRIBUT ***********/
    private String NIDK;
    private LocalDate akhirKontrak;

    /*********** METHOD ***********/
    // Konstruktor
    public DosenTamu() {
        this.NIDK = "";
    }

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate akhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    // Getter Dosen Tamu
    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    // Setter Dosen Tamu
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    // Menghitung sisa kontrak
    public String sisaKontrak() {
        Period sisaKontrak = Period.between(LocalDate.now(), akhirKontrak);
        return sisaKontrak.getYears() + " tahun " + sisaKontrak.getMonths() + " bulan";
    }

    // Menghitung tunjangan dosen tamu
    @Override
    public double tunjangan() {
        return 0.025 * gajiPokok;
    }

    // Print
    @Override
    public void printInfo() {
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("NIDK            : " + NIDK);
        super.printInfo();
        System.out.println("Akhir Kontrak   : " + akhirKontrak);
        System.out.println("Sisa Kontrak    : " + sisaKontrak());
    }
}
