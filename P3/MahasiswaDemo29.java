package P3;

import java.util.Scanner;

public class MahasiswaDemo29 {
    public static void main(String[] args) {
        Scanner satria = new Scanner(System.in);
        Mahasiswa29[] arrayofMahasiswa = new Mahasiswa29[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa[i] = new Mahasiswa29();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayofMahasiswa[i].nim = satria.nextLine();
            System.out.print("Nama : ");
            arrayofMahasiswa[i].nama = satria.nextLine();
            System.out.print("Kelas : ");
            arrayofMahasiswa[i].kelas = satria.nextLine();
            System.out.print("IPK : ");
            dummy = satria.nextLine();
            arrayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayofMahasiswa[i].cetakInfo();
            System.out.println("-------------------------------------");
        }
    satria.close();
    }
}
