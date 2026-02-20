package P1;

import java.util.Scanner;

public class T2 {
    static Scanner satria = new Scanner(System.in);

    static String[][] input29 (String[][] Jadwal29) {
        for (int i = 0; i < Jadwal29.length; i++) {
            for (int j = 0; j < Jadwal29[i].length; j++) {
                if (j == 0) {
                    System.out.print("Masukkan mata kuliah : ");
                    Jadwal29[i][j] = satria.nextLine();
                } else if (j == 1) {
                    System.out.print("Masukkkan nama ruang : ");
                    Jadwal29[i][j] = satria.nextLine();
                } else if (j == 2) {
                    System.out.print("Masukkan hari kuliah : ");
                    Jadwal29[i][j] = satria.nextLine();
                } else if (j == 3) {
                    System.out.print("Masukkan waktu kuliah : ");
                    Jadwal29[i][j] = satria.nextLine();
                }
            }
        }
        return Jadwal29;
    }

    static void tampil29 (String[][] Jadwal29) {
        System.out.println();
        System.out.println("Jadwal Kuliah");
        System.out.println("=========================================================================================================");
        System.out.printf("%-3s %-30s %-20s %-15s %-20s\n", "No", "Mata Kuliah", "Ruang", "Hari", "Waktu");
        System.out.println("=========================================================================================================");
        
        for (int i = 0; i < Jadwal29.length; i++) {
            System.out.printf("%-3d %-30s %-20s %-15s %-20s\n", (i + 1), Jadwal29[i][0], Jadwal29[i][1], Jadwal29[i][2], Jadwal29[i][3]);
        }
        
        System.out.println("=========================================================================================================");
    }

    static void tampilHari29 (String[][] Jadwal29) {
        System.out.println();
        System.out.print("Masukkan hari yang ingin ditampilkan : ");
        String hari29 = satria.nextLine();
        System.out.println("Jadwal Kuliah pada hari " + hari29);
        System.out.println("=========================================================================================================");
        System.out.printf("%-3s %-30s %-20s %-15s %-20s\n", "No", "Mata Kuliah", "Ruang", "Hari", "Waktu");
        System.out.println("=========================================================================================================");
        
        for (int i = 0; i < Jadwal29.length; i++) {
            if (Jadwal29[i][2].equalsIgnoreCase(hari29)) {
                System.out.printf("%-3d %-30s %-20s %-15s %-20s\n", (i + 1), Jadwal29[i][0], Jadwal29[i][1], Jadwal29[i][2], Jadwal29[i][3]);
            }
        }

        System.out.println("=========================================================================================================");
    }

    static void tampilMataKuliah29 (String[][] Jadwal29) {
        System.out.println();
        System.out.print("Masukkan mata kuliah yang ingin ditampilkan : ");
        String mataKuliah29 = satria.nextLine();
        System.out.println("Jadwal Kuliah untuk mata kuliah " + mataKuliah29);
        System.out.println("=========================================================================================================");
        System.out.printf("%-3s %-30s %-20s %-15s %-20s\n", "No", "Mata Kuliah", "Ruang", "Hari", "Waktu");
        System.out.println("=========================================================================================================");
        
        for (int i = 0; i < Jadwal29.length; i++) {
            if (Jadwal29[i][0].equalsIgnoreCase(mataKuliah29)) {
                System.out.printf("%-3d %-30s %-20s %-15s %-20s\n", (i + 1), Jadwal29[i][0], Jadwal29[i][1], Jadwal29[i][2], Jadwal29[i][3]);
            }
        }

        System.out.println("=========================================================================================================");
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Jumlah jadwal kuliah : ");
        int jumlahJadwal29 = satria.nextInt();
        satria.nextLine();
        String[][] Jadwal29 = new String[jumlahJadwal29][4];
        
        int pilihan29;
        boolean lanjut = true;
        boolean dataInputted = false;
        
        while (lanjut) {
            System.out.println();
            System.out.println("===== MENU JADWAL KULIAH =====");
            System.out.println("1. Input data jadwal");
            System.out.println("2. Tampilkan semua jadwal");
            System.out.println("3. Tampilkan jadwal berdasarkan hari");
            System.out.println("4. Tampilkan jadwal berdasarkan mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5) : ");
            pilihan29 = satria.nextInt();
            satria.nextLine();
            
            switch (pilihan29) {
                case 1:
                    Jadwal29 = input29(Jadwal29);
                    dataInputted = true;
                    System.out.println("Data jadwal berhasil diinput");
                    break;
                case 2:
                    if (dataInputted) {
                        tampil29(Jadwal29);
                    } else {
                        System.out.println("Silahkan input data terlebih dahulu");
                    }
                    break;
                case 3:
                    if (dataInputted) {
                        tampilHari29(Jadwal29);
                    } else {
                        System.out.println("Silahkan input data terlebih dahulu");
                    }
                    break;
                case 4:
                    if (dataInputted) {
                        tampilMataKuliah29(Jadwal29);
                    } else {
                        System.out.println("Silahkan input data terlebih dahulu");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");
                    break;
            }
        }
        satria.close();
    }
}
