/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan metode dalam class Pegawai
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 19 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /*********** ATRIBUT ***********/
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;
    protected static int counterPegawai = 0;

    /*********** METHOD ***********/
    // Konstruktor
    public Pegawai () {
        counterPegawai++;
    }

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    // Counter
    public static void printCounterPegawai() {
        System.out.println("Jumlah pegawai: " + counterPegawai);
    }

    // Getter Pegawai
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    // Setter Pegawai
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Hitung masa kerja
    public String masaKerja() {
        Period masaKerja = Period.between(TMT, LocalDate.now());
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    // Print
    public void printInfo() {
        System.out.println("NIP             : " + NIP);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("TMT             : " + TMT);
        System.out.println("Masa Kerja      : " + masaKerja());
        System.out.println("Gaji Pokok      : Rp " + gajiPokok);
    }
}
