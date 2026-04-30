/* Nama File    : CivitasAkademika.java 
 * Deskripsi    : Class untuk superclass CivitasAkademika
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class CivitasAkademika {
    /********** ATRIBUT **********/
    protected String nama;

    /********** METHOD ***********/
    // Konstruktor untuk membuat objek CivitasAkademika dengan nama tertentu
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    // Selektor untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Selektor untuk mengambil nomor identitas
    public String getNomor() {
        return " ";
    }
}