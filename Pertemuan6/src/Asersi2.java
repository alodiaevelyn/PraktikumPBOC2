/* Nama File    : Asersi2.java
 * Deskripsi    : program untuk demo asersi yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Maret 2026
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling () {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main (String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari-jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
