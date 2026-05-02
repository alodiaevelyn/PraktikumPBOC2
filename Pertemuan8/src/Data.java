import java.util.Arrays;

public class Data<T> {
    private static final int KAPASITAS = 100;
    private final T[] ruang;
    private int banyak;

    public Data(T[] contohRuang) {
        this.ruang = Arrays.copyOf(contohRuang, KAPASITAS);
        banyak = 0;
    }

    public T getIsi(int posisi) {
        return ruang [posisi - 1];
    }

    public void setIsi(int posisi, T objek) {
        if (ruang[posisi] == null) {
            banyak++;
        }
        ruang[posisi - 1] = objek;
        if (posisi > banyak) {
            banyak = posisi;
        }
    }

    public int getSize() {
        return banyak;
    }
}
