package P4;

public class Kendaraan {
    String nomorPlat;
    double jarakTempuh, konsumsiBahanBakar;

    public Kendaraan(String nomorPlat, double jarakTempuh, double konsumsiBahanBakar) {
        this.nomorPlat = nomorPlat;
        this.jarakTempuh = jarakTempuh;
        this.konsumsiBahanBakar = konsumsiBahanBakar;
    }

    public double efisiensiBBM(double jarakTempuh, double konsumsiBahanBakar) {
        double nilaiEfisiensi;

        nilaiEfisiensi = jarakTempuh / konsumsiBahanBakar;

        return nilaiEfisiensi;
    }

    public void printData(Kendaraan Kendaraan) {
        System.out.println();
        System.out.println("Data kendaraan");
        System.out.println("Nomor plat kendaraan: " + Kendaraan.nomorPlat);
        System.out.println("Jarak tempuh kendaraan: " + Kendaraan.jarakTempuh);
        System.out.println("Konsumsi bahan bakar kendaaraan: " + Kendaraan.konsumsiBahanBakar);
        // System.out.println("Nilai efisiensi kendaraan: " + Kendaraan.efisiensiBBM(i, i));
    }
}
