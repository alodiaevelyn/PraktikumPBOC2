/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan metode dalam class Titik
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 19 Februari 2026
 */

public class Titik {
    /*********** ATRIBUT ***********/
    double absis;
    double ordinat;

    /*********** METHOD ***********/
    // konstruktor untuk membuat titk (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis (double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru x
    void setOrdinat (double y) {
        ordinat = y;
    }

    void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class Titik
