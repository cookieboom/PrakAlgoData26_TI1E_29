package P2;

public class Mahasiswa29 {
    String nama29;
    String nim29;
    String kelas29;
    double ipk29;

    void tampilakanInformasi29() {
        System.out.println("Nama: " + nama29);
        System.out.println("NIM: " + nim29);
        System.out.println("IPK: " + ipk29);
        System.out.println("Kelas: " + kelas29);
    }
    void ubahKelas29(String kelasBaru) {
        kelas29 = kelasBaru;
    }
    void updateIPK29(double ipkBaru) {
        if (ipkBaru <= 0.0 || ipkBaru >= 4.0) {
            System.out.println("IPK tidak valid. IPK harus antara 0.0 dan 4.0");
            return;
        }
        ipk29 = ipkBaru;
    }
    String nilaiKinerja29 () {
        if (ipk29 >= 3.5) {
            return "Kinerja sangat Baik";
        } else if (ipk29 >= 3.0) {
            return " Kinerja baik";
        } else if (ipk29 >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
