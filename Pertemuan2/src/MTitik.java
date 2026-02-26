/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan metode dalam class Titik
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Februari 2026
 */

public class MTitik {
     public static void main (String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1; // T2 dan T1 dihitung 1 titik
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // Cek overloading
        Titik T3 = new Titik(4,5);
        T3.printTitik();

        // Cek counterTitik
        Titik T4 = new Titik(-3, 7);
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        // Cek getKuadran
        System.out.println("Kuadran T2 = " + T4.getKuadran());
    }
}
