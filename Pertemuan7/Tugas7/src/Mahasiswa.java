/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Class untuk subclass Mahasiswa
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa extends CivitasAkademika {

    /********** ATRIBUT **********/
    private String nim;
    private Dosen dosenWali;

    /********** METHOD ***********/
    // Konstruktor Mahasiswa
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    // Getter
    public String getNomor() {
        return nim;
    }

    // Setter Dosen Wali
    public void setWali(Dosen D) {
        this.dosenWali = D;
    }

    // Menampilkan data Mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Dosen Wali  : " + dosenWali.getNama());
    }
}