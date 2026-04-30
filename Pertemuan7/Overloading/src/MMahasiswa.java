/* Nama File : MMahasiswa.java
 * Deskripsi : Berisi main driver untuk menguji overloading pada class Mahasiswa
 * Pembuat   : 24060124130087
 * Tanggal   : 23 April 2026
*/

public class MMahasiswa {
    public static void main(String[] args) {
        // Konstruktor tanpa parameter
        Mahasiswa M1 = new Mahasiswa();
        System.out.println("## Mahasiswa M1 (tanpa parameter)");
        M1.printMhs();
        System.out.println();

        // Konstruktor dengan parameter 
        Mahasiswa M2 = new Mahasiswa("240601", "Denia", "Informatika");
        System.out.println("## Mahasiswa M2 (dengan parameter)");
        M2.printMhs();
        System.out.println();

        // Konstruktor cloning 
        Mahasiswa M3 = new Mahasiswa(M2);
        System.out.println("## Mahasiswa M3 (cloning M2)");
        M3.printMhs();
        System.out.println();

        // Overloading setProgramStudi
        // Tanpa parameter
        M1.setProgramStudi();
        System.out.println("## M1 setelah setProgramStudi()");
        M1.printMhs();
        System.out.println();

        // Satu parameter string
        M2.setProgramStudi("Sistem Informasi");
        System.out.println("## M2 setelah setProgramStudi(String)");
        M2.printMhs();
        System.out.println();

        // Satu parameter objek Mahasiswa lain
        M3.setProgramStudi(M2);
        System.out.println("## M3 setelah setProgramStudi(Mahasiswa)");
        M3.printMhs();
        System.out.println();
    }
}