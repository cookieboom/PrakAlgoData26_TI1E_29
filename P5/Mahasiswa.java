package P5;

public class Mahasiswa {
    String nama, nim;
    int tahunMasuk, uts, uas;

    Mahasiswa(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    int utsTinggiDC(Mahasiswa[] mhs, int left, int right) {
        if (left == right) {
            return mhs[left].uts;
        }

        int mid = (left + right) / 2;
        int tinggiKiri = utsTinggiDC(mhs, left, mid);
        int tinggiKanan = utsTinggiDC(mhs, mid + 1, right);
        return Math.max(tinggiKiri, tinggiKanan);
    }

    int utsTerendahDC(Mahasiswa[] mhs, int left, int right) {
        if (left == right) {
            return mhs[left].uts;
        }
        int mid = (left + right) / 2;
        int terendahKiri = utsTerendahDC(mhs, left, mid);
        int terendahKanan = utsTerendahDC(mhs, mid + 1, right);
        return Math.min(terendahKiri, terendahKanan);
    }

    double rataRataUASBruteForce(Mahasiswa[] mhs) {
        int total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].uas;
        }
        return (double) total / mhs.length;
    }
}
