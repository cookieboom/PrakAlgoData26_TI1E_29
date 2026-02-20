package P1;
import java.util.Scanner;

public class P2_2_1 {
    public static void main(String[] args) {
        Scanner satria = new Scanner(System.in);
        int NTugas29, NKuis29, NUTS29, NUAS29;
        System.out.println();
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        NTugas29 = satria.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        NKuis29 = satria.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        NUTS29 = satria.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        NUAS29 = satria.nextInt();
        System.out.println("======================");
        System.out.println("=====================");
        satria.close();

        if (NTugas29 < 0 || NTugas29 > 100 || NKuis29 < 0 || NKuis29 > 100 || NUTS29 < 0 || NUTS29 > 100 || NUAS29 < 0 || NUAS29 > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("=====================");
            System.out.println("=====================");

        } else {
            double NA29 = (0.2 * NTugas29) + (0.2 * NKuis29) + (0.3 * NUTS29) + (0.4 * NUAS29);
            System.out.println("Nilai Akhir : " + NA29);
            
            String nilaiHuruf29;
            String status29;
            
            if (NA29 > 80) {
                nilaiHuruf29 = "A";
                status29 = "LULUS";
            } else if (NA29 > 73) {
                nilaiHuruf29 = "B+";
                status29 = "LULUS";
            } else if (NA29 > 65) {
                nilaiHuruf29 = "B";
                status29 = "LULUS";
            } else if (NA29 > 60) {
                nilaiHuruf29 = "C+";
                status29 = "LULUS";
            } else if (NA29 > 50) {
                nilaiHuruf29 = "C";
                status29 = "LULUS";
            } else if (NA29 > 39) {
                nilaiHuruf29 = "D";
                status29 = "TIDAK LULUS";
            } else {
                nilaiHuruf29 = "E";
                status29 = "TIDAK LULUS";
            }
            
            System.out.println("Nilai Huruf : " + nilaiHuruf29);
            System.out.println("Status : " + status29);
            System.out.println("=====================");
            System.out.println("=====================");
        }
    }
}
