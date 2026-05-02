public class Anggora extends Kucing {
    public Anggora (String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " lincah melompat.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara meong lembut.");
    }
}
