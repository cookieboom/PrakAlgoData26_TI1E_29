package P12;

public class Mahasiswa29 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa29() {

    }

    public Mahasiswa29(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(
            "NIM     : " + nim +
            "\nNama     : " + nama +
            "\nKelas    : " + kelas +
            "\nIPK      : " + ipk
        );
    }
}
