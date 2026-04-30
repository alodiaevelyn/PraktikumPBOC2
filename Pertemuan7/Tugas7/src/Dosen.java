/* Nama File    : Dosen.java 
 * Deskripsi    : Class untuk subclass Dosen
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class Dosen extends CivitasAkademika {
    /********** ATRIBUT **********/
    private String nip;

    /********** METHOD ***********/
    // Konstruktor Dosen
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    // Getter
    public String getNomor() {
        return nip;
    }
}