package P1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner satria = new Scanner(System.in);
        char[] Kode29 = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] Kota29 = {
            { 'B', 'A', 'N', 'T', 'E', 'N' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            { 'B', 'O', 'G', 'O', 'R' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
            { 'M', 'A', 'L', 'A', 'N', 'G' },
            { 'T', 'E', 'G', 'A', 'L' }
        };
        System.out.println();
        System.out.print("Masukkan kode plat : ");
        char inputKode29 = satria.next().charAt(0);
        satria.close();
        
        for (int i = 0; i < Kode29.length; i++) {
            if (inputKode29 == Kode29[i]) {
                System.out.print("Kota : ");
                for (int j = 0; j < Kota29[i].length; j++) {
                    System.out.print(Kota29[i][j]);
                }
                System.out.println();
                break;
            }
        }
    }
}
