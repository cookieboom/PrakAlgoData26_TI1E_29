package P12;

public class DoubleLinkedList29 {
    Node29 head;
    Node29 tail;
    int size;

    public DoubleLinkedList29() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void addFirst(Mahasiswa29 data) {
        Node29 newNode = new Node29(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa29 data) {
        Node29 newNode = new Node29(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa29 data) {
        Node29 curr = head;
        while (curr != null && !curr.data.nim.equals(keyNim)) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemuka.");
            return;
        }

        Node29 newNode = new Node29(data);

        if (curr == tail) {
            newNode.prev = curr;
            curr.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = curr;
            newNode.next = curr.next;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        Node29 curr = head;
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Berhasi menghapus data:");
        curr.data.tampilInformasi();
    }

    public void removeLast() {
        Node29 curr = tail;
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Berhasi menghapus data:");
        curr.data.tampilInformasi();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node29 curr = head;
        while (curr != null) {
            curr.data.tampilInformasi();
            curr = curr.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node29 curr = tail;
        while (curr != null) {
            curr.data.tampilInformasi();
            curr = curr.prev;
        }
    }

    public void add(int index, Mahasiswa29 data) {
        if (index < 0) {
            System.out.println("indeks salah");
            return;
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node29 curr = head;
            for (int i = 0; i < index - 1 && curr != null; i++) {
                curr = curr.next;
            }
            
            if (curr == null) {
                System.out.println("indeks melebihi ukuran list");
                return;
            }
            
            Node29 newNode = new Node29(data);
            newNode.next = curr.next;
            newNode.prev = curr;            
            
            if (curr.next != null) {
                curr.next.prev = newNode;
            } else {
                tail = newNode;
            }
            
            curr.next = newNode;
            size++;
        }
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }
        
        Node29 temp = head;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key) && temp.next != null) {
                Node29 nodeTarget = temp.next;
                
                temp.next = nodeTarget.next;
                if (nodeTarget.next != null) {
                    nodeTarget.next.prev = temp;
                } else {
                    tail = temp;
                }

                size--;
                System.out.println("Berhasil menghapus data setelah: " + key);
                nodeTarget.data.tampilInformasi();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data dengan nama " + key + " tidak ditemukan.");
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        } else if (index == 0) {
            removeFirst();
        } else if (index < 0) {
            System.out.println("indeks salah");
            return;
        } else {
            Node29 curr = head;
            for (int i = 0; i < index && curr != null; i++) {
                curr = curr.next;
            }
            
            if (curr == null) {
                System.out.println("indeks melebihi ukuran list");
                return;
            }

            if (curr == tail) {
                tail = curr.prev;
                tail.next = null;
            } else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
            
            size--;
            System.out.println("Berhasil menghapus data:");
            curr.data.tampilInformasi();
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat diakses!");
        } else {
            head.data.tampilInformasi();
        }
    }

    public int getSize() {
        return size;
    }

    public void displaySize() {
        System.out.println("Total data dalam list: " + size);
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat diakses!");
        } else {
            tail.data.tampilInformasi();
        }
    }

    public void get(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat diakses!");
            return;
        } else if (index < 0) {
            System.out.println("indeks salah");
            return;
        }
        
        Node29 curr = head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        
        if (curr == null) {
            System.out.println("indeks melebihi ukuran list");
            return;
        }
        
        curr.data.tampilInformasi();
    }
}
