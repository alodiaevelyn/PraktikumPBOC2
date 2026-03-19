import java.time.LocalDate;

public class Tendik extends Pegawai {
    /*********** ATRIBUT ***********/
    private String bidang;

    /*********** METHOD ***********/
    // Konstruktor
    public Tendik() {
        this.bidang = "";
    }

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    // Getter Tendik
    public String getFakultas() {
        return bidang;
    }

    // Setter Dosen
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Menghitung BUP
    public LocalDate BUP() {
        return tanggalLahir.plusYears(55);
    }

    // Menghitung tanggal pensiun
    public LocalDate tanggalPensiun() {
        return BUP().plusMonths(1);
    }

    // Menghitung tunjangan
    public double tunjangan() {
        int tahun = java.time.Period.between(TMT, LocalDate.now()).getYears();
        return 0.01 * tahun * gajiPokok;
    }

    // Print
    @Override
    public void printInfo() {
        System.out.println("Jabatan         : Tendik");
        super.printInfo();
        System.out.println("Bidang          : " + bidang);
        System.out.println("Tunjangan       : Rp " + tunjangan());
        System.out.println("BUP             : " + BUP());
        System.out.println("Tanggal Pensiun : " + tanggalPensiun());
    }
}
