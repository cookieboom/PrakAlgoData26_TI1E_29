package P2;

public class MahasiswaMain29 {
    public static void main(String[] args) {
        Mahasiswa29 mhs1 = new Mahasiswa29();
        mhs1.nama29 = "Muhammad Ali Farhan";
        mhs1.nim29 = "2241720171";
        mhs1.kelas29 = "SI 2J";
        mhs1.ipk29 = 3.55;

        mhs1.tampilakanInformasi29();
        mhs1.ubahKelas29("SI 2K");
        mhs1.updateIPK29(3.60);
        mhs1.tampilakanInformasi29();

        Mahasiswa29 mhs2 = new Mahasiswa29("Annisa Nabila", "2131720160", 3.25, "TI 2L");
        mhs2.updateIPK29(3.30);
        mhs2.tampilakanInformasi29();

        Mahasiswa29 mhsSatria = new Mahasiswa29("Satria", "254107020128", 4.0, "TI 1E");
        mhsSatria.tampilakanInformasi29();
    }
}
