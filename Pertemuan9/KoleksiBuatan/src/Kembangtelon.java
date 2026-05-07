public class Kembangtelon extends Kucing{
    public Kembangtelon (String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " lincah melompat.");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " bersuara meong lembut.");
    }
}
