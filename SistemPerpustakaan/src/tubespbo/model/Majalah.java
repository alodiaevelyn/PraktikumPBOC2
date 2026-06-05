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
public class Majalah extends KoleksiPustaka {
    private int edisi;
    private String bulanTerbit;
    private String kategori;

    public Majalah(String id, String judul, String penerbit, int tahun, int edisi, String bulanTerbit, String kategori){
        super(id, judul, penerbit, tahun);
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
        this.kategori = kategori;
    }

    @Override
    public String getInfo() {
        return String.format("MAJALAH | Judul: %s | Edisi: %d | Bulan: %s | Kategori: %s | Tahun: %d", getJudul(), edisi, bulanTerbit, kategori, getTahunTerbit());
    }

    public int getEdisi(){ 
        return edisi; 
    }
    
    public String getBulanTerbit(){ 
        return bulanTerbit; 
    }
    
    public String getKategori(){ 
        return kategori; 
    }
}
