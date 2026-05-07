import java.util.LinkedList;

public class Piaraan {
    /*********** ATRIBUT ***********/
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    /*********** ATRIBUT ***********/
    public Piaraan () {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // a. i. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // a. ii. enqueAnabul()
    public void enqueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        nbelm++;
    }

    // a. iii. isMember()
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // a. iV. getAnabul()
    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    // a. v. dequeAnabul()
    

    // d. countKucing()
    public int countKucing() {
        int count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing()
    public double bobotKucing() {
        double total = 0.0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                total += ((Kucing) anabul).getBobot();
            }
        }
        return total;
    }

    // f. showJenisAnabul()
    public void showJenisAnabul() {
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getpanggilan() + " - " + anabul.getClass().getName());
        }
    }
}
