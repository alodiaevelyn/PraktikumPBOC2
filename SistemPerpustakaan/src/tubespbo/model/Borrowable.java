// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.model;
import java.io.Serializable;

/**
 * 
 * @author Lila
 */
public interface Borrowable extends Serializable {
    void pinjam(String anggotaId);
    void kembalikan();
    boolean isTersedia();
}