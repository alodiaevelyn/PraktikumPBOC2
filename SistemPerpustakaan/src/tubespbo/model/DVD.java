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
public class DVD extends KoleksiPustaka {
    private int durasiMenit;
    private String genre;
    private String sutradara;

    public DVD(String id, String judul, String sutradara, int tahun, int durasiMenit, String genre){
        super(id, judul, sutradara, tahun);
        this.sutradara = sutradara;
        this.durasiMenit = durasiMenit;
        this.genre = genre;
    }

    @Override
    public String getInfo() {
        return String.format("DVD | Judul: %s | Sutradara: %s | Durasi: %d menit | Genre: %s | Tahun: %d", getJudul(), sutradara, durasiMenit, genre, getTahunTerbit());
    }

    // Getter
    public int getDurasiMenit(){ 
        return durasiMenit; 
    }
    
    public String getGenre(){ 
        return genre; 
    }
    
    public String getSutradara(){ 
        return sutradara; 
    }
}