/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Berisi implementasi overloading pada class Mahasiswa
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa {
    /********** ATRIBUT **********/
    private String nim;
    private String nama;
    private String programStudi;

    /********** METHOD ***********/
    // Konstruktor 1 (tanpa parameter)
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // Konstruktor 2 (dengan parameter)
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // Konstruktor 3 (cloning)
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Realisasi class Mahasiswa
    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    // Setter 
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter  untuk mengubah nilai program studi (overloading)
    // Tanpa parameter
    public void setProgramStudi() {
        programStudi = "Kosong";
    }

    // Satu parameter String
    public void setProgramStudi(String prodi) {
        programStudi = prodi;
    }

    // Satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        programStudi = m.programStudi;
    }

    // Menampilkan informasi Mahasiswa
    public void printMhs() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
    }
}