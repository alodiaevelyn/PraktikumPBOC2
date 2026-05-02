public class OperatorGenerik {
    public static <T> void Tukar (Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
