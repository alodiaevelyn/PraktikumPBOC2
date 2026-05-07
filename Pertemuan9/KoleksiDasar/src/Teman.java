/* Nama File    : Teman.java 
 * Deskripsi    : Class untuk superclass Teman
 * Pembuat      : 24060124130087 Alodia Evelyn Pratikno
 * Tanggal      : 7 Mei 2026
 */

import java.util.ArrayList;

public class Teman {
    /*********** ATRIBUT ***********/
    private int nbelm;
    private ArrayList<String> Lnama;

    /*********** ATRIBUT ***********/
    public Teman () {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama()
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // c. setNama()
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // d. addNama()
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama()
    public void delNama(String nama) {
        Lnama.remove(nama);
        nbelm--;
    }

    // f. isMember()
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama()
    public void gantiNama(String nama, String namabaru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namabaru);
        }
    }

    // h. countNama()
    public int countNama(String nama) {
        int count = 0;

        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }

        return count;
    }

    // i. showTeman()
    public void showTeman() {
        System.out.println("Daftar Teman:");

        for (String n : Lnama) {
            System.out.println("- " + n);
        }
    }
}