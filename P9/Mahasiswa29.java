package P9;

public class Mahasiswa29 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa29 () {

    }

    public Mahasiswa29(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
