/* Nama File    : AngkaSialException.java
 * Deskripsi    : eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!");
    }
}
