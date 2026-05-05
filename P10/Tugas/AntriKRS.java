package P10.Tugas;

public class AntriKRS {
    MahasiswaKRS[] data;
    int front, rear, size, max;

    public AntriKRS(int n) {
        this.max = n;
        this.data = new MahasiswaKRS[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void cekAntriKosong() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian masih ada mahasiswa");
        }
    }

    public void cekAntriPenuh() {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {
            System.out.println("Antrian masih bisa ditambah");
        }
    }

    public void tambahAntrian(MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa");
        } else {
            if (isEmpty()) {
                front = 0;
                rear = 0;
                data[rear] = mhs;
            } else {
                rear = (rear + 1) % max;
                data[rear] = mhs;
            }
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian");
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Dua mahasiswa terdepan dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS [STATUS]");
        int count = Math.min(2, size);
        for (int i = 0; i < count; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS [STATUS]");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar semua mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS [STATUS]");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void prosesKRS() {
        int count = 0;
        System.out.println("\nProses KRS - Melayani maksimal 2 mahasiswa:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        while (count < 2 && !isEmpty()) {
            MahasiswaKRS mhs = data[front];
            mhs.tandaiSudahProses();
            System.out.println((count + 1) + ". " + mhs.nim + " - " + mhs.nama + " - " + mhs.prodi + " - " + mhs.kelas);
            front = (front + 1) % max;
            size--;
            count++;
        }
        System.out.println("Proses KRS - setiap 1x panggilan terdiri dari 2 mahasiswa (pada antrian no 1 dan 2)");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahProses() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].isSudahProses()) {
                count++;
            }
        }
        return count;
    }

    public int getJumlahBelumProses() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && !data[i].isSudahProses()) {
                count++;
            }
        }
        return count;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}
