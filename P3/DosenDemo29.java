package P3;

import java.util.Scanner;

public class DosenDemo29 {
    public static void main(String[] args) {
        Scanner satria = new Scanner(System.in);
        Scanner satriaS = new Scanner(System.in);
        int Dummy, usia; //counter;
        String kode, nama, jk; //jkS;
        boolean jenisKelamin;

        System.out.println();
        System.out.print("Masukkan jumlah dosen: ");
        Dummy = satria.nextInt();

        Dosen29[] arrayofDosen29 = new Dosen29[Dummy];

        for (int i = 0; i < arrayofDosen29.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = satriaS.nextLine();
            System.out.print("Nama          : ");
            nama = satriaS.nextLine();
            System.out.print("Jenis Kelamin : ");
            jk = satriaS.nextLine();
            if (jk.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            usia = satria.nextInt();
            System.out.println("------------------------------");

            arrayofDosen29[i] = new Dosen29(kode, nama, jenisKelamin, usia);
        }

        // for (Dosen29 dosen29 : arrayofDosen29) {
        //     counter = 1;

        //     System.out.println("Data Dosen ke-" + counter);
        //     System.out.println("Kode        : " + dosen29.kode);
        //     System.out.println("Nama        : " + dosen29.nama);
        //     if (dosen29.jenisKelamin == true) {
        //         jkS = "Pria";
        //     } else {
        //         jkS = "Wanita";
        //     }
        //     System.out.println("Jenis Kelamin   : " + jkS);
        //     System.out.println("Usia        : " + dosen29.usia);
        //     System.out.println("------------------------------");

        //     counter++;

        // }
        
        DataDosen29 dataDosen = new DataDosen29();

        System.out.println("\n=== DATA SEMUA DOSEN ===");
        dataDosen.dataSemuaDosen(arrayofDosen29);

        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        dataDosen.jumlahDosenPerJenisKelamin(arrayofDosen29);

        System.out.println("\n=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayofDosen29);

        System.out.println("\n=== INFO DOSEN PALING TUA ===");
        dataDosen.infoDosenPalingTua(arrayofDosen29);

        System.out.println("\n=== INFO DOSEN PALING MUDA ===");
        dataDosen.infoDosenPalingMuda(arrayofDosen29);

        satria.close();
        satriaS.close();
    }
}
