public class Main {
    public static void main(String[] args) {
        // Kelas Generik
        Datum<Anabul> data = new Datum<>(new Kucing("Abu", 3.5));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Pew"));

        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data2.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Kuki", 4.2));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Kembangtelon("Kapas", 5.1));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        // Method Generik
        System.out.println("Prosedur Tukar:");
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Princess", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Major"));

        OperatorGenerik.Tukar(hewan1, hewan2);
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);

        OperatorGenerik.Tukar(angka1, angka2);

        System.out.println(angka1.getIsi());
        System.out.println(angka2.getIsi());

        // Kelas Data
        
    }
}
