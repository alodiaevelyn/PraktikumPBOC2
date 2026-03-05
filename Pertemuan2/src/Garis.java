public class Garis {
    /*********** ATRIBUT ***********/
    Titik awal;
    Titik akhir;
    static int counterGaris;

    Garis (Titik T1, Titik T2) {
        this.awal = T1;
        this.akhir = T2;
        counterGaris++;
    }

    Garis () {
        this(new Titik(0,0), new Titik(1,1));
        counterGaris++;
    }

    //mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    void printCounterGaris() {
        System.out.println(this.counterGaris);
    }

    // mengembalikan nilai awal
    Titik getAwal() {
        return awal;
    }

    // mengembalikan nilai akhir
    Titik getAkhir() {
        return akhir;
    }

    //mengeset titik awal dengan nilai baru
    void setAwal (Titik T1) {
        awal = T1;
    }

    //mengeset titik akgir dengan nilai baru 
    void setAkhir (Titik T2) {
        akhir = T2;
    }

    double getPanjang() {
        return awal.getJarak(akhir);
    }

    double getGradien() {
        return (akhir.getOrdinat() - awal.getOrdinat()) /
               (akhir.getAbsis() - awal.getAbsis());
    }

    Titik getTitikTengah() {
        double x = (awal.getAbsis() + akhir.getAbsis()) / 2;
        double y = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    void printGaris() {
    System.out.println("Garis dari " + awal.getTitikString() + " ke " + akhir.getTitikString());
    }

    String getPersamaanGaris() {
        double m = getGradien();
        double c = awal.getOrdinat() - (m * awal.getAbsis());

        return "y = " + m + "x + " + c;
    }
}
