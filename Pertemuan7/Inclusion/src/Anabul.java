/* Nama File    : Anabul.java 
 * Deskripsi    : Class untuk induk Anabul
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama(){ 
        return nama; 
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}