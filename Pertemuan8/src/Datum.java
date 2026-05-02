public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    public void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }
}