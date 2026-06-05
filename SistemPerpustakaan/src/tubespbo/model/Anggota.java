// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Lila
 */

// Persistensi
public class Anggota implements Serializable {
    private static final long serialVersionUID = 5L;
    private static int counter = 1;

    private String id;
    private String nama;
    private String email;
    private String noTelp;
    private List<Peminjaman> riwayatPinjaman; 
    private static final int maksPinjaman = 3;

    public Anggota(String nama, String email, String noTelp) {
        this.id = "A" + String.format("%03d", counter++);
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
        this.riwayatPinjaman = new ArrayList<>();
    }

    public void tambahPinjaman(Peminjaman p) {
        riwayatPinjaman.add(p);
    }

    // Lintas paradigma
    public int getJumlahPinjamanAktif() {
        int jumlah = 0;
        for (Peminjaman p : riwayatPinjaman) {
            if (p.getStatus() == StatusPinjaman.AKTIF) {
                jumlah++;
            }
        }
        return jumlah;
    }

    public boolean bisaPinjam() {
        return getJumlahPinjamanAktif() < maksPinjaman;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | Email: %s | Pinjaman aktif: %d/%d", id, nama, email, getJumlahPinjamanAktif(), maksPinjaman);
    }

    // Getter
    public String getId(){
        return id;
    }                    
    
    public String getNama(){ 
        return nama; 
    }
    
    public String getEmail(){ 
        return email; 
    }
    
    public String getNoTelp(){ 
        return noTelp; 
    }
    
    public List<Peminjaman> getRiwayatPinjaman(){ 
        return riwayatPinjaman; 
    }
    
    public static void setCounter(int nilai){ 
        counter = nilai; 
    }
    
    public static int getCounter(){ 
        return counter; 
    }
}