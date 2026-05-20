package P12.CM;

public class DLLP {
    nodeP head;
    nodeP tail;
    int size;

    public DLLP() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return (head == null);
    } 

    public int getNoPesanan() {
            if (isEmpty()) {
                return 0 + 1;
            }
            int noTerakhir = tail.data.noAntrian; 
            return noTerakhir + 1;
    }

    public void tambahAntrian(people data) {
        data.noAntrian = getNoPesanan();
        nodeP newNode = new nodeP(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("===============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("===============================");
        System.out.printf("%-10s %-10s %-10s\n", "No Antrian", "Nama", "No HP");
        nodeP current = head;
        while (current != null) {
            current.data.cetakAntrianPeople();
            current = current.next;
        }
    }

    public void hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = tail = null;
        }
        size--;
    }
}