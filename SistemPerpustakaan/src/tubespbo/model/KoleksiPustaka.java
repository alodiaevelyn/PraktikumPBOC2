// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.model;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Lila
 */

// Persistensi
public abstract class KoleksiPustaka implements Borrowable, Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;
    private String dipinjamOleh;
    private LocalDate tanggalPinjam;

    public KoleksiPustaka(String id, String judul, String penulis, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
        this.dipinjamOleh = null;
    }

    // Polimorfisme
    public abstract String getInfo();

    @Override
    public void pinjam(String anggotaId) {
        this.tersedia = false;
        this.dipinjamOleh = anggotaId;
        this.tanggalPinjam = LocalDate.now();
    }

    @Override
    public void kembalikan() {
        this.tersedia = true;
        this.dipinjamOleh = null;
        this.tanggalPinjam = null;
    }

    @Override
    public boolean isTersedia() {
        return tersedia;
    }

    // Getter (Enkapsulasi)
    public String getId(){ 
        return id; 
    }
    
    public String getJudul(){ 
        return judul; 
    }
    
    public String getPenulis(){ 
        return penulis; 
    }
    
    public int getTahunTerbit(){ 
        return tahunTerbit; 
    }
    
    public String getDipinjamOleh(){ 
        return dipinjamOleh; 
    }
    
    public LocalDate getTanggalPinjam(){ 
        return tanggalPinjam; 
    }

    // Setter (Enkapsulasi)
    public void setJudul(String judul){ 
        this.judul = judul; 
    }
    
    public void setPenulis(String penulis){ 
        this.penulis = penulis; 
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%d) | %s", id, judul, penulis, tahunTerbit, tersedia ? "Tersedia" : "Dipinjam oleh: " + dipinjamOleh);
    }
}