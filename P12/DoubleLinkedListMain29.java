package P12;

import java.util.Scanner;

public class DoubleLinkedListMain29 {
    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa29 inputMahasiswa() {
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK : ");
        Double ipk = sc.nextDouble();
        sc.nextLine();

        Mahasiswa29 data = new Mahasiswa29(nim, nama, kelas, ipk);
        return data;
    }

    public static void main(String[] args) {
        DoubleLinkedList29 list = new DoubleLinkedList29();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data dari akhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa29 mhsAwal = inputMahasiswa();
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa29 mhsAkhir = inputMahasiswa();
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa29 dataBaru = inputMahasiswa();
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
