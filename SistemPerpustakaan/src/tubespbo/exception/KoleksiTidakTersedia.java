// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.exception;

/**
 *
 * @author Lila
 */
public class KoleksiTidakTersedia extends Exception {
    public KoleksiTidakTersedia(String judul) {
        super("Koleksi '" + judul + "' sedang tidak tersedia / sedang dipinjam.");
    }
}