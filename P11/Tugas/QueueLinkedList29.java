package P11.Tugas;

public class QueueLinkedList29 {
    Node29 front;
    Node29 rear;
    int size;
    int maxCapacity;

    public QueueLinkedList29(int maxCapacity) {
        front = null;
        rear = null;
        size = 0;
        this.maxCapacity = maxCapacity;
    }

    boolean isEmpty() {
        return (front == null);
    }

    boolean isFull() {
        return (size == maxCapacity);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa29 input) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh! Tidak dapat menambahkan mahasiswa.");
        } else {
            Node29 ndInput = new Node29(input, null);
            if (isEmpty()) {
                front = ndInput;
                rear = ndInput;
            } else {
                rear.next = ndInput;
                rear = ndInput;
            }
            size++;
            System.out.println("Data mahasiswa berhasil ditambahkan ke antrian.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada yang bisa dipanggil!");
        } else {
            Mahasiswa29 dipanggil = front.data;
            System.out.println("Memanggil antrian atas nama:");
            dipanggil.tampilInformasi();
            
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;
            }
            size--;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Akhir:");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
            Node29 temp = front;
            int i = 1;
            while (temp != null) {
                System.out.println("Antrian ke-" + i + ":");
                temp.data.tampilInformasi();
                temp = temp.next;
                i++;
            }
        } else {
            System.out.println("Antrian kosong!");
        }
    }
}
