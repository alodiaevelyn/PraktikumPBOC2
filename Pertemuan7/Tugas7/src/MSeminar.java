/* Nama File    : MSemninar.java 
 * Deskripsi    : Driver main untuk Class Seminar
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 23 April 2026
 */

public class MSeminar {
    public static void main(String[] args) {
        // Membuat objek Seminar
        Seminar S = new Seminar();

        // Membuat 2 objek Dosen
        Dosen D1 = new Dosen("Lucilla", "240601");
        Dosen D2 = new Dosen("Luuk Herssen", "240602");

        // Membuat 5 objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("Sigrika", "130001");
        Mahasiswa M2 = new Mahasiswa("Denia", "130002");
        Mahasiswa M3 = new Mahasiswa("Zahira", "130003");
        Mahasiswa M4 = new Mahasiswa("Aemeath", "130004");
        Mahasiswa M5 = new Mahasiswa("Chisa", "130005");

        // Set dosen wali
        M1.setWali(D1);
        M2.setWali(D1);
        M3.setWali(D2);
        M4.setWali(D2);
        M5.setWali(D1);

        // Registrasi peserta ke seminar
        S.registrasi(D1);
        S.registrasi(D2);
        S.registrasi(M1);
        S.registrasi(M2);
        S.registrasi(M3);
        S.registrasi(M4);
        S.registrasi(M5);

        // Menampilkan daftar peserta
        System.out.println("## Daftar Peserta");
        S.tampilPeserta();
        System.out.println();

        // Menampilkan jumlah peserta
        System.out.println("Jumlah peserta : " + S.countPeserta());
        System.out.println();

        // Menampilkan data mahasiswa
        System.out.println("## Data Mahasiswa");
        M1.tampilDataMahasiswa();
        System.out.println();
        M2.tampilDataMahasiswa();
        System.out.println();
        M3.tampilDataMahasiswa();
        System.out.println();
        M4.tampilDataMahasiswa();
        System.out.println();
        M5.tampilDataMahasiswa();
        System.out.println();

        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah mahasiswa : " + S.countMahasiswa());
        System.out.println();
    }
}