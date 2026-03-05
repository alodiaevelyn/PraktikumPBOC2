/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan metode dalam class Kendaraan
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 5 Maret 2026
 */

public class Kendaraan {
    /*********** ATRIBUT ***********/
    private String noPlat;
    private String Jenis;
    

    /*********** METHOD ***********/
    // Konstruktor
    Kendaraan() {
        this.noPlat = "";
        this.Jenis = "";
    }
    
    Kendaraan(String noPlat, String Jenis) {
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    // Getter Kendaraan
    String getNoPlat() {
        return noPlat;
    }

    String getJenis() {
        return Jenis;
    }

    // Setter Kendaraan
    void setNoPlat(String G) {
        noPlat = G;
    }

    void setJenis(String H) {
        Jenis = H;
    }
}
