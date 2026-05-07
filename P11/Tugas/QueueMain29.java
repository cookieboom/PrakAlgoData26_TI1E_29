package P11.Tugas;

import java.util.Scanner;

public class QueueMain29 {
    public static void menu() {
        System.out.println("\n=================================");
        System.out.println("Layanan Unit Kemahasiswaan");
        System.out.println("=================================");
        System.out.println("1. Tambah Antrian Mahasiswa");
        System.out.println("2. Panggil Antrian Terdepan");
        System.out.println("3. Lihat Antrian Paling Depan");
        System.out.println("4. Lihat Antrian Paling Belakang");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Cek Status Antrian (Kosong/Penuh)");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("8. Keluar");
        System.out.println("=================================");
        System.out.print("Pilih menu (1-8): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas maksimal antrian hari ini: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        QueueLinkedList29 antrian = new QueueLinkedList29(kapasitas);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (!antrian.isFull()) {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Keperluan: ");
                        String keperluan = sc.nextLine();
                        Mahasiswa29 mhs = new Mahasiswa29(nim, nama, keperluan);
                        antrian.enqueue(mhs);
                    } else {
                        System.out.println("Antrian Penuh!");
                    }
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.print();
                    break;
                case 6:
                    System.out.println("Antrian Kosong: " + antrian.isEmpty());
                    System.out.println("Antrian Penuh: " + antrian.isFull());
                    System.out.println("Jumlah mengantre saat ini: " + antrian.size);
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 8);
        sc.close();
    }
}
