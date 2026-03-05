/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan metode dalam class Dosen
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 5 Maret 2026
 */

public class Dosen {
    /*********** ATRIBUT ***********/
    private String NIP;
    private String Nama;
    private String Prodi;

    /*********** METHOD ***********/
    // Konstruktor 
    Dosen() {
        this.NIP = "";
        this.Nama = "";
        this.Prodi = "";
    }

    Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Getter Dosen
    String getNIP() {
        return NIP;
    }

    String getNama() {
        return Nama;
    }

    String getProdi() {
        return Prodi;
    }

    // Setter Dosen
    void setNIP(String A) {
        NIP = A;
    }

    void setNama(String B) {
        Nama = B;
    }

    void setProdi(String C) {
        Prodi = C;
    }
}
