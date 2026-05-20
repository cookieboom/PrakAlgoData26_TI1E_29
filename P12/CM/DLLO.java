package P12.CM;

public class DLLO {
    nodeO head;
    nodeO tail;
    int size;

    public DLLO() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void tambahPesanan(order data) {
        nodeO newNode = new nodeO(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void cetakPesananOrder() {
        if (isEmpty()) {
            System.out.println("Daftar pesanan kosong.");
            return;
        }
        System.out.println("===============================");
        System.out.println("DAFTAR PESANAN (URUT NAMA PESANAN)");
        System.out.println("===============================");
        System.out.printf("%-10s %-20s %-10s\n", "Kode", "Nama Pesanan", "Harga");
        
        for (int i = 0; i < size - 1; i++) {
            nodeO current = head;
            for (int j = 0; j < size - 1 - i; j++) {
                if (current.data.namaPesanan.compareTo(current.next.data.namaPesanan) > 0) {
                    order temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                current = current.next;
            }
        }
        
        nodeO current = head;
        while (current != null) {
            current.data.cetakPesanan();
            current = current.next;
        }
    }
}
