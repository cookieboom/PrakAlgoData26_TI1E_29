package P10.Tugas;

import java.util.Scanner;

public class SistemKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntriKRS antrian = new AntriKRS(10);
        int jumlahDPA = 0;
        int maxDPA = 30;
        int pilihan;

        do {
            System.out.println("\n===== MENU SISTEM KRS =====");
            System.out.println("1. Cek apakah antrian kosong");
            System.out.println("2. Cek apakah antrian penuh");
            System.out.println("3. Menambahkan mahasiswa ke antrian");
            System.out.println("4. Proses KRS");
            System.out.println("5. Menampilkan semua antrian");
            System.out.println("6. Menampilkan 2 mahasiswa terdepan");
            System.out.println("7. Menampilkan mahasiswa paling akhir");
            System.out.println("8. Cetak jumlah antrian");
            System.out.println("9. Cetak yang sudah melakukan proses KRS");
            System.out.println("10. Cetak yang belum melakukan proses KRS");
            System.out.println("11. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    antrian.cekAntriKosong();
                    break;
                case 2:
                    antrian.cekAntriPenuh();
                    break;
                case 3:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 4:
                    if (jumlahDPA < maxDPA) {
                        int beforeSize = antrian.getJumlahAntrian();
                        antrian.prosesKRS();
                        int afterSize = antrian.getJumlahAntrian();
                        int processed = beforeSize - afterSize;
                        jumlahDPA += processed;
                    } else {
                        System.out.println("Kuota DPA sudah habis (30 mahasiswa)");
                    }
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.lihatDuaTerdepan();
                    break;
                case 7:
                    antrian.lihatAkhir();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + antrian.getJumlahSudahProses());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + antrian.getJumlahBelumProses());
                    break;
                case 11:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
