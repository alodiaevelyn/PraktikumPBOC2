// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Lila
 */
public class Peminjaman {
    private static int counter = 1;
    private String idPinjam;
    private Anggota anggota;        
    private KoleksiPustaka koleksi; 
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private LocalDate tanggalKembalianAktual;
    private StatusPinjaman status;
    private static final int lamaPinjamHari = 7;

    public Peminjaman(Anggota anggota, KoleksiPustaka koleksi) {
        this.idPinjam = "P" + String.format("%03d", counter++);
        this.anggota = anggota;
        this.koleksi = koleksi;
        this.tanggalPinjam = LocalDate.now();
        this.tanggalKembali = tanggalPinjam.plusDays(lamaPinjamHari);
        this.status = StatusPinjaman.AKTIF;
    }

    public void selesaikan() {
        this.tanggalKembalianAktual = LocalDate.now();
        long selisih = ChronoUnit.DAYS.between(tanggalKembali, tanggalKembalianAktual);
        this.status = selisih > 0 ? StatusPinjaman.TERLAMBAT : StatusPinjaman.SELESAI;
    }

    public long getDendaHari() {
        if (tanggalKembalianAktual == null) 
            return 0;
        long selisih = ChronoUnit.DAYS.between(tanggalKembali, tanggalKembalianAktual);
        return Math.max(0, selisih);
    }

    public boolean isTerlambat() {
        return LocalDate.now().isAfter(tanggalKembali) && status == StatusPinjaman.AKTIF;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s meminjam '%s' | Pinjam: %s | Kembali: %s | Status: %s", idPinjam, anggota.getNama(), koleksi.getJudul(), tanggalPinjam, tanggalKembali, status);
    }

    // Getter
    public String getIdPinjam(){ 
        return idPinjam; 
    }
    
    public Anggota getAnggota(){ 
        return anggota; 
    }
    
    public KoleksiPustaka getKoleksi(){ 
        return koleksi; 
    }
    
    public LocalDate getTanggalPinjam(){ 
        return tanggalPinjam; 
    }
    
    public LocalDate getTanggalKembali(){ 
        return tanggalKembali; 
    }
    
    public StatusPinjaman getStatus(){ 
        return status; 
    }
}