package P1;

import java.util.Scanner;

public class P2_4_1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner satria = new Scanner(System.in);
        // Masukkan Nilai
        String[] MataKuliah29 = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] SKS29 = { 2, 2, 2, 3, 2, 2, 3, 2 };
        int[] Nilai29 = new int[MataKuliah29.length];
        String[] NilaiHuruf29 = new String[MataKuliah29.length];
        double[] BobotNilai29 = new double[MataKuliah29.length];

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        for (int i = 0; i < Nilai29.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + MataKuliah29[i] + " : ");
            Nilai29[i] = satria.nextInt();
        }
        satria.close();

        // Hasil Konversi
        System.out.println();
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-43s %15s %15s %15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < Nilai29.length; i++) {
            if (Nilai29[i] > 80) {
                NilaiHuruf29[i] = "A";
                BobotNilai29[i] = 4.0;
            } else if (Nilai29[i] > 73) {
                NilaiHuruf29[i] = "B+";
                BobotNilai29[i] = 3.5;
            } else if (Nilai29[i] > 65) {
                NilaiHuruf29[i] = "B";
                BobotNilai29[i] = 3.0;
            } else if (Nilai29[i] > 60) {
                NilaiHuruf29[i] = "C+";
                BobotNilai29[i] = 2.5;
            } else if (Nilai29[i] > 50) {
                NilaiHuruf29[i] = "C";
                BobotNilai29[i] = 2.0;
            } else if (Nilai29[i] > 39) {
                NilaiHuruf29[i] = "D";
                BobotNilai29[i] = 1.0;
            } else {
                NilaiHuruf29[i] = "E";
                BobotNilai29[i] = 0.0;
            }

            System.out.printf("%-43s %15.2f %15s %15.2f\n", MataKuliah29[i], (float) Nilai29[i], NilaiHuruf29[i],
                    BobotNilai29[i]);
            totalBobot += BobotNilai29[i] * SKS29[i];
            totalSKS += SKS29[i];
        }

        System.out.println("======================");
        double IP29 = totalBobot / totalSKS;
        System.out.printf("IP : %.2f\n", IP29);
    }

}
