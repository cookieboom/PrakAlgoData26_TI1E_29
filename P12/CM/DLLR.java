package P12.CM;

public class DLLR {
    nodeR head;
    nodeR tail;

    public DLLR() {
        head = null;
        tail = null;
    }
    
    boolean isEmpty() {
        return (head == null);
    } 
    
    public void tambahMenu(rekap data) {
        String curr = data.namaMenu;
        nodeR now = head;

        //Mengecek apakah menu yang akan dinput sudah ada
        boolean menuAda = false;
        while (now != null) {
            if (curr.equalsIgnoreCase(now.data.namaMenu)) {
                menuAda = true;
                now.data.tambahJumlah();
                break;
            }
            now = now.next;
        }

        //menambahkan menu baru jika belum ada
        if (!menuAda) {
            nodeR newNode = new nodeR(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            newNode.data.jumlah = 1;
        }
    }
    
    public void cetakPesananRekap() {
        if (isEmpty()) {
            System.out.println("Laporan pesanan kosong.");
            return;
        }
        
        //Sorting descending berdasarkan jumlah menggunakan bubble sort
        for (nodeR i = head; i != null; i = i.next) {
            for (nodeR j = head; j.next != null; j = j.next) {
                if (j.data.getJumlah() < j.next.data.getJumlah()) {
                    //Tukar data
                    rekap temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
        
        System.out.println("\n===============================\n");
        System.out.println("LAPORAN PESANAN ROYAL DELISH");
        System.out.println("\n===============================\n");
        nodeR curr = head;
        while (curr != null) {
            System.out.println("Menu: " + curr.data.getNamaMenu() + ", Jumlah: " + curr.data.getJumlah());
            curr = curr.next;
        }
        System.out.println();
    }
}
