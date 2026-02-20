package P2;

public class Dosen29 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilinformasi() {
        System.out.println("ID dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        System.out.println("Status dosen: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSekarang) {
        int lamaAktif = thnSekarang - tahunBergabung;
        return lamaAktif;
    }

    void ubahKeahliian(String bidang) {
        bidangKeahlian = bidang;
    }
}
