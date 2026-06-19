package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mahasiswa) {
        mahasiswas.set(index, mahasiswa);
    }
    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        Comparator<Mahasiswa> comparator = (m1, m2) -> m1.nim.compareTo(m2.nim);
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa(nim, "", ""), comparator);
        return index >= 0 ? index : -1;
    }

    public void sortingAscending() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortingDescending() {
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Nouren", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}