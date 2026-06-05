// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.service;
import tubespbo.exception.*;
import tubespbo.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lila
 */

// Persistensi : implementasi serializable agar seluruh data bisa disimpan ke file
public class Perpustakaan implements Serializable {
    private static final long serialVersionUID = 7L;
    private static final String fileData = "data_perpustakaan.ser";

    private String nama;

    // Koleksi
    private List<KoleksiPustaka> daftarKoleksi;
    private List<Anggota> daftarAnggota;
    private List<Peminjaman> daftarPeminjaman;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarKoleksi = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }

    public void tambahKoleksi(KoleksiPustaka koleksi) {
        daftarKoleksi.add(koleksi);
        System.out.println("✓ Koleksi berhasil ditambahkan: " + koleksi.getJudul());
    }

    public KoleksiPustaka cariKoleksiById(String id) throws DataTidakDitemukan {
        for (KoleksiPustaka k : daftarKoleksi) {
            if (k.getId().equalsIgnoreCase(id)) {
                return k;
            }
        }
        throw new DataTidakDitemukan("Koleksi", id);
    }

    public List<KoleksiPustaka> cariKoleksiByJudul(String keyword){
        List<KoleksiPustaka> hasil = new ArrayList<>();
        for (KoleksiPustaka k : daftarKoleksi) {
            if (k.getJudul().toLowerCase().contains(keyword.toLowerCase())) {
                hasil.add(k);
            }
        }
        return hasil;
    }

    // Polimorfisme
    public List<KoleksiPustaka> filterByTipe(String tipe) {
        List<KoleksiPustaka> hasil = new ArrayList<>();
        for (KoleksiPustaka k : daftarKoleksi) {
            if (tipe.equalsIgnoreCase("buku") && k instanceof Buku) hasil.add(k);
            else if (tipe.equalsIgnoreCase("majalah") && k instanceof Majalah) hasil.add(k);
            else if (tipe.equalsIgnoreCase("dvd") && k instanceof DVD) hasil.add(k);
            else if (tipe.equalsIgnoreCase("semua")) hasil.add(k);
        }
        return hasil;
    }

    public void cetakSemuaKoleksi(){
        for (KoleksiPustaka k : daftarKoleksi){
            System.out.println(k.getInfo()); 
        }
    }

    // Generik
    public <T extends KoleksiPustaka> List<T> filterTipe(Class<T> tipe){
        List<T> hasil = new ArrayList<>();
        for (KoleksiPustaka k : daftarKoleksi){
            if (tipe.isInstance(k)){
                hasil.add(tipe.cast(k));
            }
        }
        return hasil;
    }

    // Lintas Paradigma
    public List<KoleksiPustaka> getKoleksiTersedia(){
        List<KoleksiPustaka> hasil = new ArrayList<>();
        for (KoleksiPustaka k : daftarKoleksi){
            if (k.isTersedia()){
                hasil.add(k);
            }
        }
        return hasil;
    }

    public int hitungKoleksiDipinjam(){
        int jumlah = 0;
        for (KoleksiPustaka k : daftarKoleksi){
            if (!k.isTersedia()){
                jumlah++;
            }
        }
        return jumlah;
    }

    public List<KoleksiPustaka> getDaftarKoleksi(){ 
        return daftarKoleksi; 
    }

    // Anggota
    public void daftarAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("✓ Anggota terdaftar: " + anggota.getNama() + " [" + anggota.getId() + "]");
    }

    public Anggota cariAnggotaById(String id) throws DataTidakDitemukan {
        for (Anggota a : daftarAnggota) {
            if (a.getId().equalsIgnoreCase(id)) {
                return a;
            }
        }
        throw new DataTidakDitemukan("Anggota", id);
    }

    public List<Anggota> getDaftarAnggota(){ 
        return daftarAnggota; 
    }

    // Peminjaman
    public Peminjaman pinjamKoleksi(String anggotaId, String koleksiId) throws DataTidakDitemukan, KoleksiTidakTersedia, BatasPinjamanTercapai {
        Anggota anggota = cariAnggotaById(anggotaId);
        KoleksiPustaka koleksi = cariKoleksiById(koleksiId);

        if (!koleksi.isTersedia()) {
            throw new KoleksiTidakTersedia(koleksi.getJudul());
        }
        if (!anggota.bisaPinjam()) {
            throw new BatasPinjamanTercapai(anggota.getNama());
        }

        Peminjaman p = new Peminjaman(anggota, koleksi);
        koleksi.pinjam(anggotaId);
        anggota.tambahPinjaman(p);
        daftarPeminjaman.add(p);

        System.out.println("✓ Peminjaman berhasil: " + p);
        return p;
    }

    public void kembalikanKoleksi(String koleksiId) throws DataTidakDitemukan {
        KoleksiPustaka koleksi = cariKoleksiById(koleksiId);
        Peminjaman target = null;
        for (Peminjaman pm : daftarPeminjaman) {
            if (pm.getKoleksi().getId().equals(koleksiId) && pm.getStatus() == StatusPinjaman.AKTIF) {
                target = pm;
                break;
            }
        }
        if (target == null) {
            throw new DataTidakDitemukan("Peminjaman aktif untuk koleksi", koleksiId);
        }

        target.selesaikan();
        koleksi.kembalikan();

        long denda = target.getDendaHari();
        System.out.println("✓ Koleksi dikembalikan: " + koleksi.getJudul());
        if (denda > 0) {
            System.out.println(" ⚠ Denda: " + denda + " hari × Rp500 = Rp" + (denda * 500));
        }
    }

    public List<Peminjaman> getDaftarPeminjaman(){ 
        return daftarPeminjaman; 
    }
    
    public String getNama(){ 
        return nama; 
    }

    // Persistensi
    public void simpanData() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileData));
            oos.writeObject(this);
            oos.close();
            System.out.println("✓ Data berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    public static Perpustakaan muatData() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileData));
            Perpustakaan p = (Perpustakaan) ois.readObject();
            ois.close();
            System.out.println("✓ Data berhasil dimuat.");
            return p;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Belum ada data tersimpan, mulai dengan data baru.");
            return null;
        }
    }
}