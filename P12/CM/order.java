package P12.CM;

public class order {
    int kodePesanan, hargaPesanan;
    String namaPesanan;

    public order(int kodePesanan, String namaPesanan, int hargaPesanan) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.hargaPesanan = hargaPesanan;
    }

    public void cetakPesanan() {
        System.out.printf("%-10d %-20s %-10d\n", kodePesanan, namaPesanan, hargaPesanan);
    }
}
