package P11;

import java.util.Scanner;

public class SLLMain29 {
    public static void main(String[] args) {
        SingleLinkedList29 sll = new SingleLinkedList29();

        Mahasiswa29 mhs1 = new Mahasiswa29("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa29 mhs2 = new Mahasiswa29("23212201", "Bimon", "2B", 3.8);
        Mahasiswa29 mhs3 = new Mahasiswa29("22212202", "Cintia", "3C", 3.5);
        Mahasiswa29 mhs4 = new Mahasiswa29("21212203", "Dirga", "4O", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa29 mhs = new Mahasiswa29(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        sll.print();
        sc.close();
    }
}
