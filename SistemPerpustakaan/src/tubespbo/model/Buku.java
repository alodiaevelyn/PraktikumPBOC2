// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.model;

/**
 *
 * @author Lila
 */
public class Buku extends KoleksiPustaka {
    private String isbn;
    private String penerbit;
    private int jumlahHalaman;

    public Buku(String id, String judul, String penulis, int tahun, String isbn, String penerbit, int jumlahHalaman) {
        super(id, judul, penulis, tahun); 
        this.isbn = isbn;
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public String getInfo() {
        return String.format("BUKU | Judul: %s | Penulis: %s | Penerbit: %s | ISBN: %s | Halaman: %d | Tahun: %d", getJudul(), getPenulis(), penerbit, isbn, jumlahHalaman, getTahunTerbit());
    }

    // Gettter
    public String getIsbn(){ 
        return isbn; 
    }
    
    public String getPenerbit(){ 
        return penerbit; 
    }
    
    public int getJumlahHalaman(){ 
        return jumlahHalaman; 
    }
}
