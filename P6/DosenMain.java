package P6;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        DataDosen29 dataDosen = new DataDosen29();
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        
        do {
            System.out.println("\n========== MENU DATA DOSEN ==========");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (berdasarkan usia)");
            System.out.println("4. Sorting DSC (berdasarkan usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- TAMBAH DATA DOSEN ---");
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    
                    System.out.print("Masukkan jenis kelamin (Laki-laki/L atau Perempuan/P): ");
                    String jenisKelamin = sc.nextLine();
                    
                    System.out.print("Masukkan usia dosen: ");
                    int usia = sc.nextInt();
                    
                    Dosen29 dosen = new Dosen29(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosen);
                    break;
                    
                case 2:
                    System.out.println("\n--- TAMPIL DATA DOSEN ---");
                    System.out.println("Kode | Nama | Jenis Kelamin | Usia");
                    System.out.println("------------------------------------");
                    dataDosen.tampil();
                    break;
                    
                case 3:
                    System.out.println("\n--- SORTING ASC ---");
                    dataDosen.SortingASC();
                    dataDosen.tampil();
                    break;
                    
                case 4:
                    System.out.println("\n--- SORTING DSC ---");
                    dataDosen.sortingDSC();
                    dataDosen.tampil();
                    break;
                    
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
            }
        } while (pilihan != 5);
        
        sc.close();
    }
}
