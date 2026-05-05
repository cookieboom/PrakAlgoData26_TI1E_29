package P10.Tugas;

public class MahasiswaKRS {
    String nim, nama, prodi, kelas;
    boolean sudahProses;

    public MahasiswaKRS(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.sudahProses = false;
    }

    public void tampilkanData() {
        String status = sudahProses ? "Sudah Proses" : "Belum Proses";
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas + " [" + status + "]");
    }

    public void tandaiSudahProses() {
        this.sudahProses = true;
    }

    public boolean isSudahProses() {
        return sudahProses;
    }
}
