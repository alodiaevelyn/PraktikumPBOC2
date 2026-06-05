// Disusun oleh:
// Aswalila Adha Putri Telaumbanua (24060124120014)
// Alodia Evelyn Pratikno (24060124130087)
// Arini Latifatul Qalbiah (24060124140136)
// Aprillia Abel Cleodora (24060124140176)

package tubespbo.ui;
import tubespbo.exception.*;
import tubespbo.model.*;
import tubespbo.service.Perpustakaan;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;

/**
 *
 * @author Lila
 */
public class MainGUI extends JFrame {
    private Perpustakaan perpustakaan;
    private DefaultTableModel modelKoleksi;
    private DefaultTableModel modelAnggota;
    private DefaultTableModel modelPeminjaman;

    private static final Color warnaPrimer = new Color(37, 99, 235);
    private static final Color warnaSukses = new Color(22, 163, 74);
    private static final Color warnaBahaya = new Color(220, 38, 38);
    private static final Color warnaBG = new Color(248, 250, 252);

    public MainGUI(Perpustakaan perpustakaan) {
        this.perpustakaan = perpustakaan;
        initUI();
        refreshSemuaTable();
    }

    private void initUI() {
        setTitle("Sistem Manajemen Perpustakaan - " + perpustakaan.getNama());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(1100, 700);
        setLocationRelativeTo(null);

        // Header
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(warnaPrimer);
        header.setBorder(new EmptyBorder(12, 20, 12, 20));

        JLabel lblJudul = new JLabel("Perpustakaan PINKIE");
        lblJudul.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblJudul.setForeground(Color.WHITE);

        JLabel lblSub = new JLabel("Sistem Manajemen Perpustakaan");
        lblSub.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblSub.setForeground(new Color(191, 219, 254));

        JPanel judulPanel = new JPanel(new GridLayout(2, 1));
        judulPanel.setOpaque(false);
        judulPanel.add(lblJudul);
        judulPanel.add(lblSub);
        header.add(judulPanel, BorderLayout.WEST);

        // Tabs
        JTabbedPane tabs = new JTabbedPane();
        tabs.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tabs.addTab("Koleksi", buatPanelKoleksi());
        tabs.addTab("Anggota", buatPanelAnggota());
        tabs.addTab("Peminjaman", buatPanelPeminjaman());

        add(header, BorderLayout.NORTH);
        add(tabs, BorderLayout.CENTER);
    }

    private JPanel buatPanelKoleksi() {
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(warnaBG);

        String[] kolom = {"ID", "Tipe", "Judul", "Penulis/Sutradara", "Tahun", "Status", "Detail"};
        modelKoleksi = new DefaultTableModel(kolom, 0) {
            public boolean isCellEditable(int r, int c){ 
                return false; 
            }
        };
        JTable tabel = buatTabel(modelKoleksi);

        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        panelTombol.setBackground(warnaBG);

        JButton btnBuku = tombol("+ Tambah Buku", warnaPrimer);
        JButton btnMajalah = tombol("+ Tambah Majalah", warnaPrimer);
        JButton btnDVD = tombol("+ Tambah DVD", warnaPrimer);
        JButton btnRefresh = tombol("Refresh", new Color(100, 116, 139));

        btnBuku.addActionListener(e -> dialogTambahBuku());
        btnMajalah.addActionListener(e -> dialogTambahMajalah());
        btnDVD.addActionListener(e -> dialogTambahDVD());
        btnRefresh.addActionListener(e -> refreshSemuaTable());

        panelTombol.add(btnBuku); 
        panelTombol.add(btnMajalah);
        panelTombol.add(btnDVD);  
        panelTombol.add(btnRefresh);

        JPanel panelCari = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
        panelCari.setBackground(warnaBG);
        JTextField tfCari = new JTextField(20);
        JButton btnCari = tombol("Cari", new Color(100, 116, 139));
        btnCari.addActionListener(e -> cariKoleksi(tfCari.getText()));
        panelCari.add(new JLabel("Cari judul:")); 
        panelCari.add(tfCari); 
        panelCari.add(btnCari);

        JPanel panelTop = new JPanel(new BorderLayout());
        panelTop.setBackground(warnaBG);
        panelTop.add(panelTombol, BorderLayout.WEST);
        panelTop.add(panelCari, BorderLayout.EAST);

        panel.add(panelTop, BorderLayout.NORTH);
        panel.add(new JScrollPane(tabel), BorderLayout.CENTER);
        return panel;
    }

    private JPanel buatPanelAnggota(){
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(warnaBG);

        String[] kolom = {"ID", "Nama", "Email", "No. Telp", "Pinjaman Aktif"};
        modelAnggota = new DefaultTableModel(kolom, 0) {
            public boolean isCellEditable(int r, int c) { return false; }
        };

        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        panelTombol.setBackground(warnaBG);
        JButton btnTambah = tombol("+ Daftarkan Anggota", warnaPrimer);
        btnTambah.addActionListener(e -> dialogTambahAnggota());
        panelTombol.add(btnTambah);

        panel.add(panelTombol, BorderLayout.NORTH);
        panel.add(new JScrollPane(buatTabel(modelAnggota)), BorderLayout.CENTER);
        return panel;
    }

    private JPanel buatPanelPeminjaman() {
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(warnaBG);

        String[] kolom = {"ID Pinjam", "Anggota", "Koleksi", "Tgl Pinjam", "Tgl Kembali", "Status"};
        modelPeminjaman = new DefaultTableModel(kolom, 0) {
            public boolean isCellEditable(int r, int c){ 
                return false; 
            }
        };

        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        panelTombol.setBackground(warnaBG);

        JButton btnPinjam  = tombol("+ Pinjam Koleksi", warnaSukses);
        JButton btnKembali = tombol("Kembalikan", warnaBahaya);
        JButton btnRefresh = tombol("Refresh", new Color(100, 116, 139));

        btnPinjam.addActionListener(e -> dialogPinjam());
        btnKembali.addActionListener(e -> dialogKembalikan());
        btnRefresh.addActionListener(e -> refreshSemuaTable());

        panelTombol.add(btnPinjam); panelTombol.add(btnKembali); panelTombol.add(btnRefresh);
        panel.add(panelTombol, BorderLayout.NORTH);
        panel.add(new JScrollPane(buatTabel(modelPeminjaman)), BorderLayout.CENTER);
        return panel;
    }

    private void dialogTambahBuku() {
        JTextField tfJudul = new JTextField(20), tfPenulis = new JTextField(20);
        JTextField tfTahun = new JTextField(10), tfIsbn = new JTextField(20);
        JTextField tfPenerbit = new JTextField(20), tfHalaman = new JTextField(10);
        Object[] fields = {"Judul:", tfJudul, "Penulis:", tfPenulis, "Tahun:", tfTahun, "ISBN:", tfIsbn, "Penerbit:", tfPenerbit, "Jumlah Halaman:", tfHalaman};
        if (JOptionPane.showConfirmDialog(this, fields, "Tambah Buku", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String id = "B" + String.format("%03d", perpustakaan.getDaftarKoleksi().size() + 1);
                perpustakaan.tambahKoleksi(new Buku(id, tfJudul.getText(), tfPenulis.getText(),Integer.parseInt(tfTahun.getText()), tfIsbn.getText(),
                    tfPenerbit.getText(), Integer.parseInt(tfHalaman.getText())));
                refreshSemuaTable(); info("Buku berhasil ditambahkan!");
            } catch (NumberFormatException ex){ 
                error("Tahun dan halaman harus angka."); 
            }
        }
    }

    private void dialogTambahMajalah() {
        JTextField tfJudul = new JTextField(20), tfPenerbit = new JTextField(20);
        JTextField tfTahun = new JTextField(10), tfEdisi = new JTextField(10);
        JTextField tfBulan = new JTextField(15), tfKategori = new JTextField(15);
        Object[] fields = {"Judul:", tfJudul, "Penerbit:", tfPenerbit, "Tahun:", tfTahun, "Edisi ke-:", tfEdisi, "Bulan Terbit:", tfBulan, "Kategori:", tfKategori};
        if (JOptionPane.showConfirmDialog(this, fields, "Tambah Majalah", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String id = "M" + String.format("%03d", perpustakaan.getDaftarKoleksi().size() + 1);
                perpustakaan.tambahKoleksi(new Majalah(id, tfJudul.getText(), tfPenerbit.getText(), Integer.parseInt(tfTahun.getText()), Integer.parseInt(tfEdisi.getText()),
                    tfBulan.getText(), tfKategori.getText()));
                refreshSemuaTable(); info("Majalah berhasil ditambahkan!");
            } catch (NumberFormatException ex) { error("Tahun dan edisi harus angka."); }
        }
    }

    private void dialogTambahDVD() {
        JTextField tfJudul = new JTextField(20), tfSutradara = new JTextField(20);
        JTextField tfTahun = new JTextField(10), tfDurasi = new JTextField(10), tfGenre = new JTextField(15);
        Object[] fields = {"Judul:", tfJudul, "Sutradara:", tfSutradara, "Tahun:", tfTahun, "Durasi (menit):", tfDurasi, "Genre:", tfGenre};
        if (JOptionPane.showConfirmDialog(this, fields, "Tambah DVD", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                String id = "D" + String.format("%03d", perpustakaan.getDaftarKoleksi().size() + 1);
                perpustakaan.tambahKoleksi(new DVD(id, tfJudul.getText(), tfSutradara.getText(), Integer.parseInt(tfTahun.getText()), Integer.parseInt(tfDurasi.getText()), tfGenre.getText()));
                refreshSemuaTable(); info("DVD berhasil ditambahkan!");
            } catch (NumberFormatException ex){ 
                error("Tahun dan durasi harus angka."); 
            }
        }
    }

    private void dialogTambahAnggota() {
        JTextField tfNama = new JTextField(20), tfEmail = new JTextField(20), tfTelp = new JTextField(15);
        Object[] fields = {"Nama:", tfNama, "Email:", tfEmail, "No. Telp:", tfTelp};
        if (JOptionPane.showConfirmDialog(this, fields, "Daftarkan Anggota", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            Anggota a = new Anggota(tfNama.getText(), tfEmail.getText(), tfTelp.getText());
            perpustakaan.daftarAnggota(a);
            refreshSemuaTable(); info("Anggota terdaftar: " + a.getId());
        }
    }

    private void dialogPinjam() {
        JTextField tfAnggota = new JTextField(10), tfKoleksi = new JTextField(10);
        Object[] fields = {"ID Anggota:", tfAnggota, "ID Koleksi:", tfKoleksi};
        if (JOptionPane.showConfirmDialog(this, fields, "Pinjam Koleksi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            try {
                perpustakaan.pinjamKoleksi(tfAnggota.getText().trim(), tfKoleksi.getText().trim());
                refreshSemuaTable(); info("Peminjaman berhasil!");
            } catch (DataTidakDitemukan | KoleksiTidakTersedia | BatasPinjamanTercapai ex) {
                error(ex.getMessage());
            }
        }
    }

    private void dialogKembalikan() {
        String id = JOptionPane.showInputDialog(this, "Masukkan ID Koleksi yang dikembalikan:");
        if (id != null && !id.isBlank()) {
            try { perpustakaan.kembalikanKoleksi(id.trim()); refreshSemuaTable(); info("Berhasil dikembalikan!"); }
            catch (DataTidakDitemukan ex){ 
                error(ex.getMessage()); 
            }
        }
    }

    private void cariKoleksi(String keyword) {
        modelKoleksi.setRowCount(0);
        for (KoleksiPustaka k : perpustakaan.cariKoleksiByJudul(keyword)) {
            modelKoleksi.addRow(new Object[]{ k.getId(), k.getClass().getSimpleName(),k.getJudul(), k.getPenulis(), k.getTahunTerbit(),
                k.isTersedia() ? "Tersedia" : "Dipinjam", k.getInfo() });
        }
    }

    private void refreshSemuaTable() {
        modelKoleksi.setRowCount(0);
        for (KoleksiPustaka k : perpustakaan.getDaftarKoleksi()) {
            modelKoleksi.addRow(new Object[]{ k.getId(), k.getClass().getSimpleName(), k.getJudul(), k.getPenulis(), k.getTahunTerbit(),
                k.isTersedia() ? "Tersedia" : "Dipinjam", k.getInfo() });
        }
        modelAnggota.setRowCount(0);
        for (Anggota a : perpustakaan.getDaftarAnggota()) {
            modelAnggota.addRow(new Object[]{ a.getId(), a.getNama(), a.getEmail(), a.getNoTelp(), a.getJumlahPinjamanAktif() + "/3" });
        }
        modelPeminjaman.setRowCount(0);
        for (Peminjaman p : perpustakaan.getDaftarPeminjaman()) {
            modelPeminjaman.addRow(new Object[]{ p.getIdPinjam(), p.getAnggota().getNama(), p.getKoleksi().getJudul(), p.getTanggalPinjam(), p.getTanggalKembali(), p.getStatus() });
        }
    }

    public void setDataContoh() {
        perpustakaan.tambahKoleksi(new Buku("B001","Clean Code","Robert C. Martin",2008,"978-0132350884","Prentice Hall",431));
        perpustakaan.tambahKoleksi(new Buku("B002","Laskar Pelangi","Andrea Hirata",2005,"978-9799399358","Bentang Pustaka",529));
        perpustakaan.tambahKoleksi(new Buku("B003","Head First Java","Kathy Sierra",2005,"978-0596009205","O'Reilly",688));
        perpustakaan.tambahKoleksi(new Buku("B004", "Pride and Prejudice", "Jane Austen", 1813, "978-0141439518", "Penguin Classics", 432));
        perpustakaan.tambahKoleksi(new Buku("B005", "The Alchemist", "Paulo Coelho", 1988, "978-0061122415", "HarperOne", 208));
        perpustakaan.tambahKoleksi(new Buku("B006", "Sherlock Holmes: A Study in Scarlet", "Arthur Conan Doyle", 1887, "978-0486474915", "Dover Publications", 108));
        perpustakaan.tambahKoleksi(new Majalah("M001","National Geographic","Nat Geo Society",2024,312,"Maret","Sains"));
        perpustakaan.tambahKoleksi(new Majalah("M002", "Vogue", "Condé Nast", 2024, 145, "April", "Fashion"));
        perpustakaan.tambahKoleksi(new Majalah("M003", "TIME", "Time USA LLC", 2024, 98, "Juni", "Berita"));
        perpustakaan.tambahKoleksi(new Majalah("M004", "TechLife", "Tech Media", 2024, 76, "Mei", "Teknologi"));
        perpustakaan.tambahKoleksi(new DVD("D001","Interstellar","Christopher Nolan",2014,169,"Sci-Fi"));
        perpustakaan.tambahKoleksi(new DVD("D002", "Fantastic Beasts and Where to Find Them", "David Yates", 2016, 133, "Fantasy"));
        perpustakaan.tambahKoleksi(new DVD("D003", "Maleficent", "Robert Stromberg", 2014, 97, "Fantasy"));
        perpustakaan.tambahKoleksi(new DVD("D004", "The Notebook", "Nick Cassavetes", 2004, 123, "Romance"));
        perpustakaan.daftarAnggota(new Anggota("Michelle Morroone","michelle@email.com","08111222333"));
        perpustakaan.daftarAnggota(new Anggota("Gigi Hadid","gigi@email.com","08222333444"));
        perpustakaan.daftarAnggota(new Anggota("Zayn Malik","zayn@email.com","08113356742"));
        perpustakaan.daftarAnggota(new Anggota("Kylie Jenner","kylie@email.com","089877654501"));
        perpustakaan.daftarAnggota(new Anggota("Shahrukh Khan","shahrukh@email.com","08126534349"));
        perpustakaan.daftarAnggota(new Anggota("Leonardo Dicaprio","leonardo@email.com","08956215644"));
    }

    private JTable buatTabel(DefaultTableModel model) {
        JTable t = new JTable(model);
        t.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        t.setRowHeight(28);
        t.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
        t.getTableHeader().setBackground(new Color(241, 245, 249));
        t.setSelectionBackground(new Color(219, 234, 254));
        t.setGridColor(new Color(226, 232, 240));
        return t;
    }

    private JButton tombol(String teks, Color warna) {
        JButton btn = new JButton(teks);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setBackground(warna); btn.setForeground(Color.WHITE);
        btn.setBorder(new EmptyBorder(6, 14, 6, 14));
        btn.setFocusPainted(false); btn.setOpaque(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return btn;
    }

    private void info(String p){ 
        JOptionPane.showMessageDialog(this, p, "Berhasil", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    private void error(String p){ 
        JOptionPane.showMessageDialog(this, p, "Error", JOptionPane.ERROR_MESSAGE); 
    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){}

        Perpustakaan perpus = Perpustakaan.muatData();
        if (perpus == null) {
            perpus = new Perpustakaan("Perpustakaan PINKIE");
        }
        final Perpustakaan finalPerpus = perpus;
        final MainGUI gui = new MainGUI(finalPerpus);
        if (finalPerpus.getDaftarKoleksi().isEmpty()) {
            gui.setDataContoh();
            gui.refreshSemuaTable();
        }

        gui.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                finalPerpus.simpanData();
                System.exit(0);
            }
        });
        gui.setVisible(true);
    });
}
    
}