package P2;

public class MataKuliah29 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Jumlah sks: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int SKSbaru) {
        sks = SKSbaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int waktuTambah) {
        jumlahJam += waktuTambah;
    }

    void kurangiJam(int waktuKurang) {
        if (jumlahJam < waktuKurang) {
            System.out.println("jumlah jam awal lebih kecil dari jam pengurang");
        } else {
            jumlahJam -= waktuKurang;
            System.out.println("Jumlah jam baru: " + jumlahJam);
        }
    }
}
