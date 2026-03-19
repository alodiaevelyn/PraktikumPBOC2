import java.time.LocalDate;

public class MPegawai {
    public static void main (String[] args) {
        // Check Dosen Tetap
        DosenTetap DTetap1 = new DosenTetap("240601", "130001", "Lucilla", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 9500000, "Department of Voidmatters");
        System.out.println("Dosen Tetap 1:");
        DTetap1.printInfo();
        System.out.print("\n");

        DosenTetap DTetap2 = new DosenTetap();
        DTetap2.setNIP("240603");
        DTetap2.setNIDN("130006");
        DTetap2.setNama("Aemeath");
        DTetap2.setTanggalLahir(LocalDate.of(1998, 9, 14));
        DTetap2.setTMT(LocalDate.of(2021, 2, 4));
        DTetap2.setGajiPokok(6500000);
        DTetap2.setFakultas("Rabelle College");
        System.out.println("Dosen Tetap 2:");
        DTetap2.printInfo();
        System.out.print("\n");

        // Check Dosen Tamu
        DosenTamu DTamu1 = new DosenTamu("240602", "120003", "Mornye", LocalDate.of(1995, 3, 10), LocalDate.of(2020, 1, 1), 7800000, "Department of Exostrider Engineering", LocalDate.of(2027, 12, 31));
        System.out.println("Dosen Tamu 1:");
        DTamu1.printInfo();
        System.out.print("\n");

        DosenTamu DTamu2 = new DosenTamu();
        DTamu2.setNIP("240604");
        DTamu2.setNIDK("120005");
        DTamu2.setNama("Sigrika");
        DTamu2.setTanggalLahir(LocalDate.of(1999, 3,18));
        DTamu2.setTMT(LocalDate.of(2021, 2,4));
        DTamu2.setGajiPokok(6200000);
        DTamu2.setFakultas("Department of Light Energy Sciences");
        DTamu2.setAkhirKontrak(LocalDate.of(2028, 12, 31));
        System.out.println("Dosen Tamu 2:");
        DTamu2.printInfo();
        System.out.print("\n");

        // Check Tendik
        Tendik T1 = new Tendik("240401", "Luuk Herssen", LocalDate.of(1990, 7, 20), LocalDate.of(2018, 5, 1), 5900000, "Sumber Daya");
        System.out.println("Tendik 1:");
        T1.printInfo();
        System.out.print("\n");

        Tendik T2 = new Tendik();
        T2.setNIP("240402");
        T2.setNama("Lynae");
        T2.setTanggalLahir(LocalDate.of(1998, 8, 26));
        T2.setTMT(LocalDate.of(2022, 2,1));
        T2.setGajiPokok(5300000);
        T2.setBidang("Akademik");
        System.out.println("Tendik 2:");
        T2.printInfo();
        System.out.print("\n");
    }
}
