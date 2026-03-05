/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan metode dalam class Titik
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 26 Februari 2026
 */

public class Titik {
    /*********** ATRIBUT ***********/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*********** METHOD ***********/
    // konstruktor untuk membuat titk (0,0)
    Titik() {
        this(0,0); // Product method overloading
        counterTitik++;
    }

    Titik(double x, double y) { // Overloading Constructor (nama konstruktor sama tapi parameter berbeda)
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    void printCounterTitik() {
        System.out.println(this.counterTitik);
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

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T) {
    return Math.sqrt(
        Math.pow(this.absis - T.getAbsis(), 2) +
        Math.pow(this.ordinat - T.getOrdinat(), 2));
    }

    void refleksiX() {
    absis = absis * (-1);
    }

    void refleksiY() {
        ordinat = ordinat * (-1);
    }

    Titik getRefleksiX() {
        return new Titik(getAbsis(), getOrdinat() * (-1));
    }

    Titik getRefleksiY() {
        return new Titik(getAbsis() * (-1), getOrdinat());
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    String getTitikString() { // untuk print di Garis
    return "(" + absis + "," + ordinat + ")";
}
}
