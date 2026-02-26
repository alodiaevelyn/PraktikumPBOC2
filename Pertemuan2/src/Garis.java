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
        this(new Titik())
    }

    // mengembalikan nilai awal
    Titik getAwal() {
        return awal;
    }

    // mengembalikan nilai akhir
    Titik getAkhir() {
        return akhir;
    }
}
