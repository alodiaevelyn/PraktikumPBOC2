public class MGaris {
    public static void main(String[] args) {

        Titik A = new Titik(-2,0);
        Titik B = new Titik(0,4);

        Garis G1 = new Garis(A, B);

        System.out.println("Panjang garis = " + G1.getPanjang());
        System.out.println("Gradien = " + G1.getGradien());

        Titik C = G1.getTitikTengah();
        System.out.print("Titik tengah = ");
        C.printTitik();

        System.out.println("Persamaan garis : " + G1.getPersamaanGaris());

        Titik D = new Titik(1,1);
        Titik E = new Titik(3,5);

        Garis G2 = new Garis(D, E);

        System.out.println("Sejajar = " + G1.isSejajar(G2));
        System.out.println("Tegak lurus = " + G1.isTegakLurus(G2));

        Garis G3 = new Garis();
        G3.printGaris();

        System.out.println("Jumlah objek garis = " + Garis.getCounterGaris());
    }
}