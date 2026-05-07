/* Nama File    : Anabul.java 
 * Deskripsi    : Class untuk superclass Anabul
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public abstract class Anabul {
    protected String panggilan;

    public Anabul(String panggilan){
        this.panggilan = panggilan;
    }

    public String getpanggilan(){ 
        return panggilan; 
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}