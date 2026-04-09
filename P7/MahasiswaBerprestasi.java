package P7;

public class MahasiswaBerprestasi {
    Mahasiswa[] listMhs;
    int idx;

    public MahasiswaBerprestasi(int ukuran) {
        listMhs = new Mahasiswa[ukuran];
        idx = 0;
    }

    public void tambah(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nim\t: " + listMhs[i].nim);
            System.out.println("Nama\t: " + listMhs[i].nama);
            System.out.println("Kelas\t: " + listMhs[i].kelas);
            System.out.println("IPK\t: " + listMhs[i].ipk);
            System.out.println();
        }
    }

    public int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    public int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                // Data descending: jika mid > cari, cari berada di sebelah kanan
                return findBinarySearch(cari, mid + 1, right);
            } else {
                // Data descending: jika mid < cari, cari berada di sebelah kiri
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
}
