/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan metode dalam class Mahasiswa
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /*********** ATRIBUT ***********/
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList <MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********** METHOD ***********/
    // Konstruktor
    Mahasiswa() {
        this.NIM = "";
        this.Nama = "";
        this.Prodi = "";
        this.listMatkul = new ArrayList<>();
    }

    Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Getter Mahasiswa
    String getNIM() {
        return NIM;
    }

    String getNama() {
        return Nama;
    }

    String getProdi() {
        return Prodi;
    }

    Dosen getDosenWali() {
        return dosenWali;
    }

    Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Setter Mahasiswa
    void setNIP(String H) {
        NIM = H;
    }

    void setNama(String I) {
        Nama = I;
    }

    void setProdi(String J) {
        Prodi = J;
    }

    void setDosenWali(Dosen K) {
        dosenWali = K;
    }

    void setKendaraan(Kendaraan L) {
        kendaraan = L;
    }

    // Menambahkan mata kuliah
    void addMatkul (MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    // Menghitung jumlah SKS
    int getJumlahSKS() {
        int i;
        int totalSKS = 0;
        for (i = 0; i < listMatkul.size(); i++) {
            totalSKS = totalSKS + listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    // Menghitung jumlah matkul
    int getJumlahMatkul() {
        return listMatkul.size();
    }

    // Method print
    void printMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
    }

    void printDetailMhs() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
        System.out.println("Mata Kuliah:");
        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("- " + listMatkul.get(i).getNama());
        }
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getNoPlat());
    }
}
