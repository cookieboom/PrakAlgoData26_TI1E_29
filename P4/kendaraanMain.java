package P4;

import java.util.Scanner;

public class kendaraanMain {
    public static void main(String[] args) {
        // Deklarasi
        Scanner sc = new Scanner(System.in);
        Scanner scA = new Scanner(System.in);
        int n;
        String nomorPlat = "";
        double jarakTempuh = 0, konsumsiBahanBakar = 0;

        // Input jumlah kendaraan
        System.out.println();
        System.out.print("Masukkan jumlah kendaraan: ");
        n = scA.nextInt();
        Kendaraan kd1 = new Kendaraan(nomorPlat, jarakTempuh, konsumsiBahanBakar);
        Kendaraan[] kd = new Kendaraan[n];

        // Memasukkan data objek kendaraan
        for (int i = 0; i < kd.length; i++) {
            System.out.println();
            System.out.print("Masukkan nomor plat kendaraan: ");
            nomorPlat = sc.nextLine();
            System.out.print("Masukkan jarak tempuh kendaraan: ");
            jarakTempuh = scA.nextDouble();
            System.out.print("Masukkan konsumsi bahan bakar kendaraan: ");
            konsumsiBahanBakar = scA.nextDouble();

            kd[i] = new Kendaraan(nomorPlat, jarakTempuh, konsumsiBahanBakar);
        }

        // Menampilkan semua data objek
        for (int i = 0; i < kd.length; i++) {
            kd1.printData(kd[i]);
        }

        // Hitung efisiensi
        double[] efisien = new double[n];
        for (int i = 0; i < kd.length; i++) {
            efisien[i] = kd1.efisiensiBBM(kd[i].jarakTempuh, kd[i].konsumsiBahanBakar);
        }

        // Tampilkan kendaraan paling efisien
        int idx = 0;
        double dummy = 0;
        for (int i = 0; i < efisien.length; i++) {
            if (efisien[i]>dummy) {
                dummy = efisien[i];
                idx = i;
            }
        }
        System.out.println();
        System.out.println("Kendaraan yang paling efisien : ");
        kd1.printData(kd[idx]);

        // Persentase efisiensi
        int counter = 0;
        for (int i = 0; i < efisien.length; i++) {
            if (efisien[i] < 10) {
                counter += 1;
            }
        }
        System.out.println();
        System.out.println("Persentase kendaraan dengan nilai efisiensi >10: " + ((efisien.length-counter)*(100/efisien.length)) + "%");


        // Mengatasi error resource leak
        sc.close();
        scA.close();
    }
}
