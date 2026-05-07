package P11.Tugas;

public class Mahasiswa29 {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa29(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-15s %s\n", nim, nama, keperluan);
    }
}
