package P11;

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
        System.out.printf("%-10s %-20s %-10s %-5.2f%n", nama, nim, kelas, ipk);
    }
}
