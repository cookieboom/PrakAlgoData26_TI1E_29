package P1;

public class P2_5_1 {
    static void Pendapatan29(int[][] stockBunga, int[] hargaBunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            int TotalPendapatan29 = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                TotalPendapatan29 += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan dari RoyalGarden " + (i+1) + " : Rp " + TotalPendapatan29);
            if (TotalPendapatan29 > 15000000) {
                System.out.println("Status : Untung");
            } else {
                System.out.println("Status : Rugi");
            }
        }
    }

    public static void main(String[] args) {
        int[][] StockBunga29 = {
            { 10, 5, 15, 7 }, 
            { 6, 11, 9, 12 }, 
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };
        int[] HargaBunga29 = { 75000, 50000, 60000, 10000 };
        Pendapatan29(StockBunga29, HargaBunga29);
    }
}
