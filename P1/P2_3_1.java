package P1;

import java.util.Scanner;

public class P2_3_1 {
    public static void main(String[] args) {
        Scanner satria = new Scanner(System.in);
        long n29, NIM29;

        System.out.println();
        System.out.print("Masukkan nilai NIM : ");
        NIM29 = satria.nextLong();
        n29 = NIM29 % 100;
        System.out.println("N : " + n29);
        satria.close();

        for (int i = 0; i < n29; i++) {
            if ((i + 1) == 10 || (i + 1) == 15)
                continue;
            else if ((i + 1) % 3 == 0)
                System.out.print("# ");
            else if ((i + 1) % 2 == 0)
                System.out.print(i + 1 + " ");
            else if ((i + 1) % 2 == 1)
                System.out.print("* ");
        }
    }
}
