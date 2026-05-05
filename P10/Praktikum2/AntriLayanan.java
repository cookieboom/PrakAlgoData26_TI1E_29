package P10.Praktikum2;

public class AntriLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntriLayanan(int n) {
        this.max = n;
        this.data = new Mahasiswa[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Queue kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menamabahkan mahasiswa");
        } else {
            if (IsEmpty()) {
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

    public Mahasiswa layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }
}
