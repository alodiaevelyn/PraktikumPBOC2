public class MAnabul {
    public static void main(String[] args) {
        Anabul[] peliharaan = new Anabul[4];
        peliharaan[0] = new Kucing("Meng");
        peliharaan[1] = new Anjing("Pew");
        peliharaan[2] = new Burung("Kuki");
        peliharaan[3] = new Kucing("Abu");

        System.out.println("## Simulasi Anabul");
        for (Anabul a : peliharaan) {
            a.Gerak();
            a.Bersuara();
            System.out.println();
        }
    }
}